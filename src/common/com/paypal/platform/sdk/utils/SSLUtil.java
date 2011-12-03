package common.com.paypal.platform.sdk.utils;

/*
 * Copyright 2005, 2009 PayPal, Inc. All Rights Reserved.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 * Default TrustManager checks that a cert is signed by a well known certificate
 * authority, like Verisign or Thawte.
 */
class RelaxedX509TrustManager implements X509TrustManager {
	public boolean checkClientTrusted(java.security.cert.X509Certificate[] chain) {
		return true;
	}

	public boolean isServerTrusted(java.security.cert.X509Certificate[] chain) {
		return true;
	}

	public java.security.cert.X509Certificate[] getAcceptedIssuers() {
		return null;
	}

	public void checkClientTrusted(java.security.cert.X509Certificate[] chain,
			String authType) {
	}

	public void checkServerTrusted(java.security.cert.X509Certificate[] chain,
			String authType) {
	}
}

public abstract class SSLUtil {

	public static KeyManagerFactory kmf = null;


	/**
	 * This method returns the SSLContext object.
	 *
	 * @param keymanagers
	 *            KeyManager[] The key managers
	 * @return SSLContext
	 * @throws IOException
	 *             if an IOException occurs
	 */
	public static SSLContext getSSLContext(KeyManager[] keymanagers,
			boolean trustAll) throws IOException {
		try {
		//	SSLContext ctx = SSLContext.getInstance("SSL"); // TLS, SSLv3, SSL
			SSLContext ctx = SSLContext.getInstance("SSLv3"); // TLS, SSLv3, SSL
			SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
			random.setSeed(System.currentTimeMillis());
			if (trustAll) {
				TrustManager[] tm = { new RelaxedX509TrustManager() }; // customized,
				ctx.init(keymanagers, tm, random);
			} else {
				ctx.init(keymanagers, null, random);
			}
			return ctx;
		} catch (Exception e) {
			
			throw new IOException(e.getMessage());
		}
	} // getSSLContext

	public static SSLContext getDefaultSSLContext(boolean trustAll) throws IOException, NoSuchAlgorithmException, KeyManagementException {
		
			SSLContext ctx = SSLContext.getInstance("SSL"); // TLS, SSLv3, SSL
		//	SSLContext ctx = SSLContext.getInstance("SSLv3"); // TLS, SSLv3, SSL
			SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
			random.setSeed(System.currentTimeMillis());

			if (trustAll) {
				TrustManager[] tm = { new RelaxedX509TrustManager() }; // customized,
				ctx.init(null, tm, random);
			} else {
				ctx.init(null, null, random);
			}
			return ctx;

		
	} // getSSLContext

	public static boolean isEmpty(String s) {
		return s == null || s.length() == 0;
	}

	public static KeyStore p12ToKeyStore(String p12Path, String password,
		String jsseProdvider) throws KeyStoreException, NoSuchProviderException,FileNotFoundException, NoSuchAlgorithmException,CertificateException,IOException {
		KeyStore ks = null;
		ks = KeyStore.getInstance("PKCS12", jsseProdvider);
		FileInputStream in;
		in = new FileInputStream(p12Path);
		ks.load(in, password.toCharArray());
		return ks;
	}
	public static SSLContext setupClientAuthSSL(String jsseProvider,
			String cert_path, String cert_password, boolean trustAll) throws NoSuchAlgorithmException, IOException, UnrecoverableKeyException, KeyStoreException, NoSuchProviderException, CertificateException		 {
		kmf = KeyManagerFactory.getInstance("SunX509");
		KeyStore ks = p12ToKeyStore(cert_path, cert_password, jsseProvider);
		kmf.init(ks, cert_password.toCharArray());
		return getSSLContext(kmf.getKeyManagers(), trustAll);
	}


}
