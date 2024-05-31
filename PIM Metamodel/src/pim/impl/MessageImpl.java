/**
 */
package pim.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import pim.IntermediatePackage;
import pim.Message;
import pim.MessageRecipient;
import pim.MessageSender;
import pim.TimeDistribution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pim.impl.MessageImpl#getDelayDistributionType <em>Delay Distribution Type</em>}</li>
 *   <li>{@link pim.impl.MessageImpl#getDelayDistributionParameters <em>Delay Distribution Parameters</em>}</li>
 *   <li>{@link pim.impl.MessageImpl#getMessagerecipient <em>Messagerecipient</em>}</li>
 *   <li>{@link pim.impl.MessageImpl#getMessagesender <em>Messagesender</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends MinimalEObjectImpl.Container implements Message {
	/**
	 * The default value of the '{@link #getDelayDistributionType() <em>Delay Distribution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayDistributionType()
	 * @generated
	 * @ordered
	 */
	protected static final TimeDistribution DELAY_DISTRIBUTION_TYPE_EDEFAULT = TimeDistribution.EXPONENTIAL;

	/**
	 * The cached value of the '{@link #getDelayDistributionType() <em>Delay Distribution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayDistributionType()
	 * @generated
	 * @ordered
	 */
	protected TimeDistribution delayDistributionType = DELAY_DISTRIBUTION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDelayDistributionParameters() <em>Delay Distribution Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayDistributionParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> delayDistributionParameters;

	/**
	 * The cached value of the '{@link #getMessagerecipient() <em>Messagerecipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagerecipient()
	 * @generated
	 * @ordered
	 */
	protected MessageRecipient messagerecipient;

	/**
	 * The cached value of the '{@link #getMessagesender() <em>Messagesender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagesender()
	 * @generated
	 * @ordered
	 */
	protected MessageSender messagesender;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediatePackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDistribution getDelayDistributionType() {
		return delayDistributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelayDistributionType(TimeDistribution newDelayDistributionType) {
		TimeDistribution oldDelayDistributionType = delayDistributionType;
		delayDistributionType = newDelayDistributionType == null ? DELAY_DISTRIBUTION_TYPE_EDEFAULT : newDelayDistributionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.MESSAGE__DELAY_DISTRIBUTION_TYPE, oldDelayDistributionType, delayDistributionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getDelayDistributionParameters() {
		if (delayDistributionParameters == null) {
			delayDistributionParameters = new EDataTypeUniqueEList<Double>(Double.class, this, IntermediatePackage.MESSAGE__DELAY_DISTRIBUTION_PARAMETERS);
		}
		return delayDistributionParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageRecipient getMessagerecipient() {
		if (messagerecipient != null && messagerecipient.eIsProxy()) {
			InternalEObject oldMessagerecipient = (InternalEObject)messagerecipient;
			messagerecipient = (MessageRecipient)eResolveProxy(oldMessagerecipient);
			if (messagerecipient != oldMessagerecipient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediatePackage.MESSAGE__MESSAGERECIPIENT, oldMessagerecipient, messagerecipient));
			}
		}
		return messagerecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageRecipient basicGetMessagerecipient() {
		return messagerecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessagerecipient(MessageRecipient newMessagerecipient, NotificationChain msgs) {
		MessageRecipient oldMessagerecipient = messagerecipient;
		messagerecipient = newMessagerecipient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediatePackage.MESSAGE__MESSAGERECIPIENT, oldMessagerecipient, newMessagerecipient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessagerecipient(MessageRecipient newMessagerecipient) {
		if (newMessagerecipient != messagerecipient) {
			NotificationChain msgs = null;
			if (messagerecipient != null)
				msgs = ((InternalEObject)messagerecipient).eInverseRemove(this, IntermediatePackage.MESSAGE_RECIPIENT__MESSAGE, MessageRecipient.class, msgs);
			if (newMessagerecipient != null)
				msgs = ((InternalEObject)newMessagerecipient).eInverseAdd(this, IntermediatePackage.MESSAGE_RECIPIENT__MESSAGE, MessageRecipient.class, msgs);
			msgs = basicSetMessagerecipient(newMessagerecipient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.MESSAGE__MESSAGERECIPIENT, newMessagerecipient, newMessagerecipient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSender getMessagesender() {
		if (messagesender != null && messagesender.eIsProxy()) {
			InternalEObject oldMessagesender = (InternalEObject)messagesender;
			messagesender = (MessageSender)eResolveProxy(oldMessagesender);
			if (messagesender != oldMessagesender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediatePackage.MESSAGE__MESSAGESENDER, oldMessagesender, messagesender));
			}
		}
		return messagesender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSender basicGetMessagesender() {
		return messagesender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessagesender(MessageSender newMessagesender, NotificationChain msgs) {
		MessageSender oldMessagesender = messagesender;
		messagesender = newMessagesender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediatePackage.MESSAGE__MESSAGESENDER, oldMessagesender, newMessagesender);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessagesender(MessageSender newMessagesender) {
		if (newMessagesender != messagesender) {
			NotificationChain msgs = null;
			if (messagesender != null)
				msgs = ((InternalEObject)messagesender).eInverseRemove(this, IntermediatePackage.MESSAGE_SENDER__MESSAGE, MessageSender.class, msgs);
			if (newMessagesender != null)
				msgs = ((InternalEObject)newMessagesender).eInverseAdd(this, IntermediatePackage.MESSAGE_SENDER__MESSAGE, MessageSender.class, msgs);
			msgs = basicSetMessagesender(newMessagesender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.MESSAGE__MESSAGESENDER, newMessagesender, newMessagesender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediatePackage.MESSAGE__MESSAGERECIPIENT:
				if (messagerecipient != null)
					msgs = ((InternalEObject)messagerecipient).eInverseRemove(this, IntermediatePackage.MESSAGE_RECIPIENT__MESSAGE, MessageRecipient.class, msgs);
				return basicSetMessagerecipient((MessageRecipient)otherEnd, msgs);
			case IntermediatePackage.MESSAGE__MESSAGESENDER:
				if (messagesender != null)
					msgs = ((InternalEObject)messagesender).eInverseRemove(this, IntermediatePackage.MESSAGE_SENDER__MESSAGE, MessageSender.class, msgs);
				return basicSetMessagesender((MessageSender)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediatePackage.MESSAGE__MESSAGERECIPIENT:
				return basicSetMessagerecipient(null, msgs);
			case IntermediatePackage.MESSAGE__MESSAGESENDER:
				return basicSetMessagesender(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntermediatePackage.MESSAGE__DELAY_DISTRIBUTION_TYPE:
				return getDelayDistributionType();
			case IntermediatePackage.MESSAGE__DELAY_DISTRIBUTION_PARAMETERS:
				return getDelayDistributionParameters();
			case IntermediatePackage.MESSAGE__MESSAGERECIPIENT:
				if (resolve) return getMessagerecipient();
				return basicGetMessagerecipient();
			case IntermediatePackage.MESSAGE__MESSAGESENDER:
				if (resolve) return getMessagesender();
				return basicGetMessagesender();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IntermediatePackage.MESSAGE__DELAY_DISTRIBUTION_TYPE:
				setDelayDistributionType((TimeDistribution)newValue);
				return;
			case IntermediatePackage.MESSAGE__DELAY_DISTRIBUTION_PARAMETERS:
				getDelayDistributionParameters().clear();
				getDelayDistributionParameters().addAll((Collection<? extends Double>)newValue);
				return;
			case IntermediatePackage.MESSAGE__MESSAGERECIPIENT:
				setMessagerecipient((MessageRecipient)newValue);
				return;
			case IntermediatePackage.MESSAGE__MESSAGESENDER:
				setMessagesender((MessageSender)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IntermediatePackage.MESSAGE__DELAY_DISTRIBUTION_TYPE:
				setDelayDistributionType(DELAY_DISTRIBUTION_TYPE_EDEFAULT);
				return;
			case IntermediatePackage.MESSAGE__DELAY_DISTRIBUTION_PARAMETERS:
				getDelayDistributionParameters().clear();
				return;
			case IntermediatePackage.MESSAGE__MESSAGERECIPIENT:
				setMessagerecipient((MessageRecipient)null);
				return;
			case IntermediatePackage.MESSAGE__MESSAGESENDER:
				setMessagesender((MessageSender)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IntermediatePackage.MESSAGE__DELAY_DISTRIBUTION_TYPE:
				return delayDistributionType != DELAY_DISTRIBUTION_TYPE_EDEFAULT;
			case IntermediatePackage.MESSAGE__DELAY_DISTRIBUTION_PARAMETERS:
				return delayDistributionParameters != null && !delayDistributionParameters.isEmpty();
			case IntermediatePackage.MESSAGE__MESSAGERECIPIENT:
				return messagerecipient != null;
			case IntermediatePackage.MESSAGE__MESSAGESENDER:
				return messagesender != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (delayDistributionType: ");
		result.append(delayDistributionType);
		result.append(", delayDistributionParameters: ");
		result.append(delayDistributionParameters);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
