/**
 */
package pim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Sender</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pim.MessageSender#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see pim.IntermediatePackage#getMessageSender()
 * @model abstract="true"
 * @generated
 */
public interface MessageSender extends EObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pim.Message#getMessagesender <em>Messagesender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(Message)
	 * @see pim.IntermediatePackage#getMessageSender_Message()
	 * @see pim.Message#getMessagesender
	 * @model opposite="messagesender" required="true"
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link pim.MessageSender#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

} // MessageSender
