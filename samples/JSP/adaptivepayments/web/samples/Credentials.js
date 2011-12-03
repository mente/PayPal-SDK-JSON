/**
*This method disables and enables fields according to the type selected
*to send the credentials
*
*/
function onClick(type){
	switch(type)
    {
		case 'cert':
			document.login.signature.disabled = true;
			document.login.certificate.disabled = false;
			document.login.privateKeyPassword.disabled = false;
			break;
		case 'tokens':
			document.login.signature.disabled = false;
			document.login.certificate.disabled = true;
			document.login.privateKeyPassword.disabled = true;
			break;
    }
}

/**
*This method sets the name of the button clicked to the hidden field
*/
function setButName(strButName)
{
	document.login.butName.value=strButName;
}
