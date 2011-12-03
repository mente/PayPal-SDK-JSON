package common.com.paypal.platform.sdk;

import java.io.OutputStream;

public class StringOutputStream extends OutputStream {

	protected StringBuffer buf = new StringBuffer();

	@Override
	public void close() {
		// Nothing to do
	}

	@Override
	public void flush() {
		// Clear the buffer
		buf.delete( 0, buf.length() );
	}

	@Override
	public void write(byte[] b) {
		String str = new String( b );
		this.buf.append( str );
	}

	@Override
	public void write(byte[] b, int off, int len) {
		String str = new String( b, off, len );
		this.buf.append( str );
	}

	@Override
	public void write(int b) {
		String str = Integer.toString( b );
		this.buf.append( str );
	}

	@Override
	public String toString() {
		return buf.toString();
	}
}
