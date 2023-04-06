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

import pim.ErrorSubPath;
import pim.InputElement;
import pim.IntermediatePackage;
import pim.MessageSubPath;
import pim.OutputElement;
import pim.ResourceDescriptor;
import pim.SignalSubPath;
import pim.SimpleActivity;
import pim.TimerSubPath;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pim.impl.SimpleActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link pim.impl.SimpleActivityImpl#getNextelement <em>Nextelement</em>}</li>
 *   <li>{@link pim.impl.SimpleActivityImpl#getBufferCapacity <em>Buffer Capacity</em>}</li>
 *   <li>{@link pim.impl.SimpleActivityImpl#getResourcedescriptor <em>Resourcedescriptor</em>}</li>
 *   <li>{@link pim.impl.SimpleActivityImpl#getMessagesubpath <em>Messagesubpath</em>}</li>
 *   <li>{@link pim.impl.SimpleActivityImpl#getTimersubpath <em>Timersubpath</em>}</li>
 *   <li>{@link pim.impl.SimpleActivityImpl#getErrorsubpath <em>Errorsubpath</em>}</li>
 *   <li>{@link pim.impl.SimpleActivityImpl#getSignalsubpath <em>Signalsubpath</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleActivityImpl extends MinimalEObjectImpl.Container implements SimpleActivity {
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
	 * The cached value of the '{@link #getMessagesubpath() <em>Messagesubpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagesubpath()
	 * @generated
	 * @ordered
	 */
	protected MessageSubPath messagesubpath;

	/**
	 * The cached value of the '{@link #getTimersubpath() <em>Timersubpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimersubpath()
	 * @generated
	 * @ordered
	 */
	protected TimerSubPath timersubpath;

	/**
	 * The cached value of the '{@link #getErrorsubpath() <em>Errorsubpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorsubpath()
	 * @generated
	 * @ordered
	 */
	protected ErrorSubPath errorsubpath;

	/**
	 * The cached value of the '{@link #getSignalsubpath() <em>Signalsubpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalsubpath()
	 * @generated
	 * @ordered
	 */
	protected SignalSubPath signalsubpath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediatePackage.Literals.SIMPLE_ACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.SIMPLE_ACTIVITY__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediatePackage.SIMPLE_ACTIVITY__NEXTELEMENT, oldNextelement, newNextelement);
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
				msgs = ((InternalEObject)nextelement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.SIMPLE_ACTIVITY__NEXTELEMENT, null, msgs);
			if (newNextelement != null)
				msgs = ((InternalEObject)newNextelement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.SIMPLE_ACTIVITY__NEXTELEMENT, null, msgs);
			msgs = basicSetNextelement(newNextelement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.SIMPLE_ACTIVITY__NEXTELEMENT, newNextelement, newNextelement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.SIMPLE_ACTIVITY__BUFFER_CAPACITY, oldBufferCapacity, bufferCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceDescriptor> getResourcedescriptor() {
		if (resourcedescriptor == null) {
			resourcedescriptor = new EObjectContainmentEList<ResourceDescriptor>(ResourceDescriptor.class, this, IntermediatePackage.SIMPLE_ACTIVITY__RESOURCEDESCRIPTOR);
		}
		return resourcedescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSubPath getMessagesubpath() {
		return messagesubpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessagesubpath(MessageSubPath newMessagesubpath, NotificationChain msgs) {
		MessageSubPath oldMessagesubpath = messagesubpath;
		messagesubpath = newMessagesubpath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediatePackage.SIMPLE_ACTIVITY__MESSAGESUBPATH, oldMessagesubpath, newMessagesubpath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessagesubpath(MessageSubPath newMessagesubpath) {
		if (newMessagesubpath != messagesubpath) {
			NotificationChain msgs = null;
			if (messagesubpath != null)
				msgs = ((InternalEObject)messagesubpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.SIMPLE_ACTIVITY__MESSAGESUBPATH, null, msgs);
			if (newMessagesubpath != null)
				msgs = ((InternalEObject)newMessagesubpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.SIMPLE_ACTIVITY__MESSAGESUBPATH, null, msgs);
			msgs = basicSetMessagesubpath(newMessagesubpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.SIMPLE_ACTIVITY__MESSAGESUBPATH, newMessagesubpath, newMessagesubpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerSubPath getTimersubpath() {
		return timersubpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimersubpath(TimerSubPath newTimersubpath, NotificationChain msgs) {
		TimerSubPath oldTimersubpath = timersubpath;
		timersubpath = newTimersubpath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediatePackage.SIMPLE_ACTIVITY__TIMERSUBPATH, oldTimersubpath, newTimersubpath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimersubpath(TimerSubPath newTimersubpath) {
		if (newTimersubpath != timersubpath) {
			NotificationChain msgs = null;
			if (timersubpath != null)
				msgs = ((InternalEObject)timersubpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.SIMPLE_ACTIVITY__TIMERSUBPATH, null, msgs);
			if (newTimersubpath != null)
				msgs = ((InternalEObject)newTimersubpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.SIMPLE_ACTIVITY__TIMERSUBPATH, null, msgs);
			msgs = basicSetTimersubpath(newTimersubpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.SIMPLE_ACTIVITY__TIMERSUBPATH, newTimersubpath, newTimersubpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorSubPath getErrorsubpath() {
		return errorsubpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorsubpath(ErrorSubPath newErrorsubpath, NotificationChain msgs) {
		ErrorSubPath oldErrorsubpath = errorsubpath;
		errorsubpath = newErrorsubpath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediatePackage.SIMPLE_ACTIVITY__ERRORSUBPATH, oldErrorsubpath, newErrorsubpath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorsubpath(ErrorSubPath newErrorsubpath) {
		if (newErrorsubpath != errorsubpath) {
			NotificationChain msgs = null;
			if (errorsubpath != null)
				msgs = ((InternalEObject)errorsubpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.SIMPLE_ACTIVITY__ERRORSUBPATH, null, msgs);
			if (newErrorsubpath != null)
				msgs = ((InternalEObject)newErrorsubpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.SIMPLE_ACTIVITY__ERRORSUBPATH, null, msgs);
			msgs = basicSetErrorsubpath(newErrorsubpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.SIMPLE_ACTIVITY__ERRORSUBPATH, newErrorsubpath, newErrorsubpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalSubPath getSignalsubpath() {
		return signalsubpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalsubpath(SignalSubPath newSignalsubpath, NotificationChain msgs) {
		SignalSubPath oldSignalsubpath = signalsubpath;
		signalsubpath = newSignalsubpath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediatePackage.SIMPLE_ACTIVITY__SIGNALSUBPATH, oldSignalsubpath, newSignalsubpath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalsubpath(SignalSubPath newSignalsubpath) {
		if (newSignalsubpath != signalsubpath) {
			NotificationChain msgs = null;
			if (signalsubpath != null)
				msgs = ((InternalEObject)signalsubpath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.SIMPLE_ACTIVITY__SIGNALSUBPATH, null, msgs);
			if (newSignalsubpath != null)
				msgs = ((InternalEObject)newSignalsubpath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.SIMPLE_ACTIVITY__SIGNALSUBPATH, null, msgs);
			msgs = basicSetSignalsubpath(newSignalsubpath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.SIMPLE_ACTIVITY__SIGNALSUBPATH, newSignalsubpath, newSignalsubpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediatePackage.SIMPLE_ACTIVITY__NEXTELEMENT:
				return basicSetNextelement(null, msgs);
			case IntermediatePackage.SIMPLE_ACTIVITY__RESOURCEDESCRIPTOR:
				return ((InternalEList<?>)getResourcedescriptor()).basicRemove(otherEnd, msgs);
			case IntermediatePackage.SIMPLE_ACTIVITY__MESSAGESUBPATH:
				return basicSetMessagesubpath(null, msgs);
			case IntermediatePackage.SIMPLE_ACTIVITY__TIMERSUBPATH:
				return basicSetTimersubpath(null, msgs);
			case IntermediatePackage.SIMPLE_ACTIVITY__ERRORSUBPATH:
				return basicSetErrorsubpath(null, msgs);
			case IntermediatePackage.SIMPLE_ACTIVITY__SIGNALSUBPATH:
				return basicSetSignalsubpath(null, msgs);
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
			case IntermediatePackage.SIMPLE_ACTIVITY__NAME:
				return getName();
			case IntermediatePackage.SIMPLE_ACTIVITY__NEXTELEMENT:
				return getNextelement();
			case IntermediatePackage.SIMPLE_ACTIVITY__BUFFER_CAPACITY:
				return getBufferCapacity();
			case IntermediatePackage.SIMPLE_ACTIVITY__RESOURCEDESCRIPTOR:
				return getResourcedescriptor();
			case IntermediatePackage.SIMPLE_ACTIVITY__MESSAGESUBPATH:
				return getMessagesubpath();
			case IntermediatePackage.SIMPLE_ACTIVITY__TIMERSUBPATH:
				return getTimersubpath();
			case IntermediatePackage.SIMPLE_ACTIVITY__ERRORSUBPATH:
				return getErrorsubpath();
			case IntermediatePackage.SIMPLE_ACTIVITY__SIGNALSUBPATH:
				return getSignalsubpath();
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
			case IntermediatePackage.SIMPLE_ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case IntermediatePackage.SIMPLE_ACTIVITY__NEXTELEMENT:
				setNextelement((InputElement)newValue);
				return;
			case IntermediatePackage.SIMPLE_ACTIVITY__BUFFER_CAPACITY:
				setBufferCapacity((Double)newValue);
				return;
			case IntermediatePackage.SIMPLE_ACTIVITY__RESOURCEDESCRIPTOR:
				getResourcedescriptor().clear();
				getResourcedescriptor().addAll((Collection<? extends ResourceDescriptor>)newValue);
				return;
			case IntermediatePackage.SIMPLE_ACTIVITY__MESSAGESUBPATH:
				setMessagesubpath((MessageSubPath)newValue);
				return;
			case IntermediatePackage.SIMPLE_ACTIVITY__TIMERSUBPATH:
				setTimersubpath((TimerSubPath)newValue);
				return;
			case IntermediatePackage.SIMPLE_ACTIVITY__ERRORSUBPATH:
				setErrorsubpath((ErrorSubPath)newValue);
				return;
			case IntermediatePackage.SIMPLE_ACTIVITY__SIGNALSUBPATH:
				setSignalsubpath((SignalSubPath)newValue);
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
			case IntermediatePackage.SIMPLE_ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IntermediatePackage.SIMPLE_ACTIVITY__NEXTELEMENT:
				setNextelement((InputElement)null);
				return;
			case IntermediatePackage.SIMPLE_ACTIVITY__BUFFER_CAPACITY:
				setBufferCapacity(BUFFER_CAPACITY_EDEFAULT);
				return;
			case IntermediatePackage.SIMPLE_ACTIVITY__RESOURCEDESCRIPTOR:
				getResourcedescriptor().clear();
				return;
			case IntermediatePackage.SIMPLE_ACTIVITY__MESSAGESUBPATH:
				setMessagesubpath((MessageSubPath)null);
				return;
			case IntermediatePackage.SIMPLE_ACTIVITY__TIMERSUBPATH:
				setTimersubpath((TimerSubPath)null);
				return;
			case IntermediatePackage.SIMPLE_ACTIVITY__ERRORSUBPATH:
				setErrorsubpath((ErrorSubPath)null);
				return;
			case IntermediatePackage.SIMPLE_ACTIVITY__SIGNALSUBPATH:
				setSignalsubpath((SignalSubPath)null);
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
			case IntermediatePackage.SIMPLE_ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IntermediatePackage.SIMPLE_ACTIVITY__NEXTELEMENT:
				return nextelement != null;
			case IntermediatePackage.SIMPLE_ACTIVITY__BUFFER_CAPACITY:
				return bufferCapacity != BUFFER_CAPACITY_EDEFAULT;
			case IntermediatePackage.SIMPLE_ACTIVITY__RESOURCEDESCRIPTOR:
				return resourcedescriptor != null && !resourcedescriptor.isEmpty();
			case IntermediatePackage.SIMPLE_ACTIVITY__MESSAGESUBPATH:
				return messagesubpath != null;
			case IntermediatePackage.SIMPLE_ACTIVITY__TIMERSUBPATH:
				return timersubpath != null;
			case IntermediatePackage.SIMPLE_ACTIVITY__ERRORSUBPATH:
				return errorsubpath != null;
			case IntermediatePackage.SIMPLE_ACTIVITY__SIGNALSUBPATH:
				return signalsubpath != null;
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
				case IntermediatePackage.SIMPLE_ACTIVITY__NEXTELEMENT: return IntermediatePackage.OUTPUT_ELEMENT__NEXTELEMENT;
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
				case IntermediatePackage.OUTPUT_ELEMENT__NEXTELEMENT: return IntermediatePackage.SIMPLE_ACTIVITY__NEXTELEMENT;
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

} //SimpleActivityImpl
