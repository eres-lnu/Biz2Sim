/**
 */
package pim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pim.EventDependentSubPath;
import pim.InputElement;
import pim.IntermediatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Dependent Sub Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pim.impl.EventDependentSubPathImpl#getName <em>Name</em>}</li>
 *   <li>{@link pim.impl.EventDependentSubPathImpl#getNextelement <em>Nextelement</em>}</li>
 *   <li>{@link pim.impl.EventDependentSubPathImpl#isInterrupt <em>Interrupt</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EventDependentSubPathImpl extends MinimalEObjectImpl.Container implements EventDependentSubPath {
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
	 * The default value of the '{@link #isInterrupt() <em>Interrupt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterrupt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERRUPT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInterrupt() <em>Interrupt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterrupt()
	 * @generated
	 * @ordered
	 */
	protected boolean interrupt = INTERRUPT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventDependentSubPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediatePackage.Literals.EVENT_DEPENDENT_SUB_PATH;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.EVENT_DEPENDENT_SUB_PATH__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediatePackage.EVENT_DEPENDENT_SUB_PATH__NEXTELEMENT, oldNextelement, newNextelement);
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
				msgs = ((InternalEObject)nextelement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.EVENT_DEPENDENT_SUB_PATH__NEXTELEMENT, null, msgs);
			if (newNextelement != null)
				msgs = ((InternalEObject)newNextelement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.EVENT_DEPENDENT_SUB_PATH__NEXTELEMENT, null, msgs);
			msgs = basicSetNextelement(newNextelement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.EVENT_DEPENDENT_SUB_PATH__NEXTELEMENT, newNextelement, newNextelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInterrupt() {
		return interrupt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterrupt(boolean newInterrupt) {
		boolean oldInterrupt = interrupt;
		interrupt = newInterrupt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.EVENT_DEPENDENT_SUB_PATH__INTERRUPT, oldInterrupt, interrupt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediatePackage.EVENT_DEPENDENT_SUB_PATH__NEXTELEMENT:
				return basicSetNextelement(null, msgs);
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
			case IntermediatePackage.EVENT_DEPENDENT_SUB_PATH__NAME:
				return getName();
			case IntermediatePackage.EVENT_DEPENDENT_SUB_PATH__NEXTELEMENT:
				return getNextelement();
			case IntermediatePackage.EVENT_DEPENDENT_SUB_PATH__INTERRUPT:
				return isInterrupt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IntermediatePackage.EVENT_DEPENDENT_SUB_PATH__NAME:
				setName((String)newValue);
				return;
			case IntermediatePackage.EVENT_DEPENDENT_SUB_PATH__NEXTELEMENT:
				setNextelement((InputElement)newValue);
				return;
			case IntermediatePackage.EVENT_DEPENDENT_SUB_PATH__INTERRUPT:
				setInterrupt((Boolean)newValue);
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
			case IntermediatePackage.EVENT_DEPENDENT_SUB_PATH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IntermediatePackage.EVENT_DEPENDENT_SUB_PATH__NEXTELEMENT:
				setNextelement((InputElement)null);
				return;
			case IntermediatePackage.EVENT_DEPENDENT_SUB_PATH__INTERRUPT:
				setInterrupt(INTERRUPT_EDEFAULT);
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
			case IntermediatePackage.EVENT_DEPENDENT_SUB_PATH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IntermediatePackage.EVENT_DEPENDENT_SUB_PATH__NEXTELEMENT:
				return nextelement != null;
			case IntermediatePackage.EVENT_DEPENDENT_SUB_PATH__INTERRUPT:
				return interrupt != INTERRUPT_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", Interrupt: ");
		result.append(interrupt);
		result.append(')');
		return result.toString();
	}

} //EventDependentSubPathImpl
