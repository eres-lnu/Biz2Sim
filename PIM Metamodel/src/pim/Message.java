/**
 */
package pim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pim.Message#getDelayDistributionType <em>Delay Distribution Type</em>}</li>
 *   <li>{@link pim.Message#getDelayDistributionParameters <em>Delay Distribution Parameters</em>}</li>
 *   <li>{@link pim.Message#getMessagerecipient <em>Messagerecipient</em>}</li>
 *   <li>{@link pim.Message#getMessagesender <em>Messagesender</em>}</li>
 * </ul>
 *
 * @see pim.IntermediatePackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Delay Distribution Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pim.TimeDistribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay Distribution Type</em>' attribute.
	 * @see pim.TimeDistribution
	 * @see #setDelayDistributionType(TimeDistribution)
	 * @see pim.IntermediatePackage#getMessage_DelayDistributionType()
	 * @model
	 * @generated
	 */
	TimeDistribution getDelayDistributionType();

	/**
	 * Sets the value of the '{@link pim.Message#getDelayDistributionType <em>Delay Distribution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay Distribution Type</em>' attribute.
	 * @see pim.TimeDistribution
	 * @see #getDelayDistributionType()
	 * @generated
	 */
	void setDelayDistributionType(TimeDistribution value);

	/**
	 * Returns the value of the '<em><b>Delay Distribution Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay Distribution Parameters</em>' attribute list.
	 * @see pim.IntermediatePackage#getMessage_DelayDistributionParameters()
	 * @model default="0"
	 * @generated
	 */
	EList<Double> getDelayDistributionParameters();

	/**
	 * Returns the value of the '<em><b>Messagerecipient</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pim.MessageRecipient#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messagerecipient</em>' reference.
	 * @see #setMessagerecipient(MessageRecipient)
	 * @see pim.IntermediatePackage#getMessage_Messagerecipient()
	 * @see pim.MessageRecipient#getMessage
	 * @model opposite="message" required="true"
	 * @generated
	 */
	MessageRecipient getMessagerecipient();

	/**
	 * Sets the value of the '{@link pim.Message#getMessagerecipient <em>Messagerecipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Messagerecipient</em>' reference.
	 * @see #getMessagerecipient()
	 * @generated
	 */
	void setMessagerecipient(MessageRecipient value);

	/**
	 * Returns the value of the '<em><b>Messagesender</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pim.MessageSender#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messagesender</em>' reference.
	 * @see #setMessagesender(MessageSender)
	 * @see pim.IntermediatePackage#getMessage_Messagesender()
	 * @see pim.MessageSender#getMessage
	 * @model opposite="message" required="true"
	 * @generated
	 */
	MessageSender getMessagesender();

	/**
	 * Sets the value of the '{@link pim.Message#getMessagesender <em>Messagesender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Messagesender</em>' reference.
	 * @see #getMessagesender()
	 * @generated
	 */
	void setMessagesender(MessageSender value);

} // Message
