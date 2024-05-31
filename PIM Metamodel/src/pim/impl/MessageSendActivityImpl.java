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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pim.InputElement;
import pim.IntermediatePackage;
import pim.Message;
import pim.MessageSendActivity;
import pim.MessageSender;
import pim.OutputElement;
import pim.ResourceDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Send Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pim.impl.MessageSendActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link pim.impl.MessageSendActivityImpl#getNextelement <em>Nextelement</em>}</li>
 *   <li>{@link pim.impl.MessageSendActivityImpl#getBufferCapacity <em>Buffer Capacity</em>}</li>
 *   <li>{@link pim.impl.MessageSendActivityImpl#getResourcedescriptor <em>Resourcedescriptor</em>}</li>
 *   <li>{@link pim.impl.MessageSendActivityImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageSendActivityImpl extends MinimalEObjectImpl.Container implements MessageSendActivity {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "defaultName";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNextelement() <em>Nextelement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextelement()
	 * @generated
	 * @ordered
	 */
	protected InputElement nextelement;

	/**
	 * The default value of the '{@link #getBufferCapacity() <em>Buffer Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final double BUFFER_CAPACITY_EDEFAULT = 25.0;

	/**
	 * The cached value of the '{@link #getBufferCapacity() <em>Buffer Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferCapacity()
	 * @generated
	 * @ordered
	 */
	protected double bufferCapacity = BUFFER_CAPACITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResourcedescriptor() <em>Resourcedescriptor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcedescriptor()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceDescriptor> resourcedescriptor;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected Message message;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageSendActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediatePackage.Literals.MESSAGE_SEND_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.MESSAGE_SEND_ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputElement getNextelement() {
		return nextelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextelement(InputElement newNextelement, NotificationChain msgs) {
		InputElement oldNextelement = nextelement;
		nextelement = newNextelement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediatePackage.MESSAGE_SEND_ACTIVITY__NEXTELEMENT, oldNextelement, newNextelement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextelement(InputElement newNextelement) {
		if (newNextelement != nextelement) {
			NotificationChain msgs = null;
			if (nextelement != null)
				msgs = ((InternalEObject)nextelement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.MESSAGE_SEND_ACTIVITY__NEXTELEMENT, null, msgs);
			if (newNextelement != null)
				msgs = ((InternalEObject)newNextelement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.MESSAGE_SEND_ACTIVITY__NEXTELEMENT, null, msgs);
			msgs = basicSetNextelement(newNextelement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.MESSAGE_SEND_ACTIVITY__NEXTELEMENT, newNextelement, newNextelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBufferCapacity() {
		return bufferCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBufferCapacity(double newBufferCapacity) {
		double oldBufferCapacity = bufferCapacity;
		bufferCapacity = newBufferCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.MESSAGE_SEND_ACTIVITY__BUFFER_CAPACITY, oldBufferCapacity, bufferCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceDescriptor> getResourcedescriptor() {
		if (resourcedescriptor == null) {
			resourcedescriptor = new EObjectContainmentEList<ResourceDescriptor>(ResourceDescriptor.class, this, IntermediatePackage.MESSAGE_SEND_ACTIVITY__RESOURCEDESCRIPTOR);
		}
		return resourcedescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessage() {
		if (message != null && message.eIsProxy()) {
			InternalEObject oldMessage = (InternalEObject)message;
			message = (Message)eResolveProxy(oldMessage);
			if (message != oldMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediatePackage.MESSAGE_SEND_ACTIVITY__MESSAGE, oldMessage, message));
			}
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessage(Message newMessage, NotificationChain msgs) {
		Message oldMessage = message;
		message = newMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediatePackage.MESSAGE_SEND_ACTIVITY__MESSAGE, oldMessage, newMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(Message newMessage) {
		if (newMessage != message) {
			NotificationChain msgs = null;
			if (message != null)
				msgs = ((InternalEObject)message).eInverseRemove(this, IntermediatePackage.MESSAGE__MESSAGESENDER, Message.class, msgs);
			if (newMessage != null)
				msgs = ((InternalEObject)newMessage).eInverseAdd(this, IntermediatePackage.MESSAGE__MESSAGESENDER, Message.class, msgs);
			msgs = basicSetMessage(newMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.MESSAGE_SEND_ACTIVITY__MESSAGE, newMessage, newMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__MESSAGE:
				if (message != null)
					msgs = ((InternalEObject)message).eInverseRemove(this, IntermediatePackage.MESSAGE__MESSAGESENDER, Message.class, msgs);
				return basicSetMessage((Message)otherEnd, msgs);
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
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__NEXTELEMENT:
				return basicSetNextelement(null, msgs);
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__RESOURCEDESCRIPTOR:
				return ((InternalEList<?>)getResourcedescriptor()).basicRemove(otherEnd, msgs);
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__MESSAGE:
				return basicSetMessage(null, msgs);
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
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__NAME:
				return getName();
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__NEXTELEMENT:
				return getNextelement();
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__BUFFER_CAPACITY:
				return getBufferCapacity();
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__RESOURCEDESCRIPTOR:
				return getResourcedescriptor();
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__MESSAGE:
				if (resolve) return getMessage();
				return basicGetMessage();
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
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__NEXTELEMENT:
				setNextelement((InputElement)newValue);
				return;
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__BUFFER_CAPACITY:
				setBufferCapacity((Double)newValue);
				return;
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__RESOURCEDESCRIPTOR:
				getResourcedescriptor().clear();
				getResourcedescriptor().addAll((Collection<? extends ResourceDescriptor>)newValue);
				return;
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__MESSAGE:
				setMessage((Message)newValue);
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
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__NEXTELEMENT:
				setNextelement((InputElement)null);
				return;
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__BUFFER_CAPACITY:
				setBufferCapacity(BUFFER_CAPACITY_EDEFAULT);
				return;
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__RESOURCEDESCRIPTOR:
				getResourcedescriptor().clear();
				return;
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__MESSAGE:
				setMessage((Message)null);
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
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__NEXTELEMENT:
				return nextelement != null;
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__BUFFER_CAPACITY:
				return bufferCapacity != BUFFER_CAPACITY_EDEFAULT;
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__RESOURCEDESCRIPTOR:
				return resourcedescriptor != null && !resourcedescriptor.isEmpty();
			case IntermediatePackage.MESSAGE_SEND_ACTIVITY__MESSAGE:
				return message != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == OutputElement.class) {
			switch (derivedFeatureID) {
				case IntermediatePackage.MESSAGE_SEND_ACTIVITY__NEXTELEMENT: return IntermediatePackage.OUTPUT_ELEMENT__NEXTELEMENT;
				default: return -1;
			}
		}
		if (baseClass == MessageSender.class) {
			switch (derivedFeatureID) {
				case IntermediatePackage.MESSAGE_SEND_ACTIVITY__MESSAGE: return IntermediatePackage.MESSAGE_SENDER__MESSAGE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == OutputElement.class) {
			switch (baseFeatureID) {
				case IntermediatePackage.OUTPUT_ELEMENT__NEXTELEMENT: return IntermediatePackage.MESSAGE_SEND_ACTIVITY__NEXTELEMENT;
				default: return -1;
			}
		}
		if (baseClass == MessageSender.class) {
			switch (baseFeatureID) {
				case IntermediatePackage.MESSAGE_SENDER__MESSAGE: return IntermediatePackage.MESSAGE_SEND_ACTIVITY__MESSAGE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", bufferCapacity: ");
		result.append(bufferCapacity);
		result.append(')');
		return result.toString();
	}

} //MessageSendActivityImpl
