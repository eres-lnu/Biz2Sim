/**
 */
package pim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Recipient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pim.MessageRecipient#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see pim.IntermediatePackage#getMessageRecipient()
 * @model abstract="true"
 * @generated
 */
public interface MessageRecipient extends EObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pim.Message#getMessagerecipient <em>Messagerecipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(Message)
	 * @see pim.IntermediatePackage#getMessageRecipient_Message()
	 * @see pim.Message#getMessagerecipient
	 * @model opposite="messagerecipient" required="true"
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link pim.MessageRecipient#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

} // MessageRecipient
