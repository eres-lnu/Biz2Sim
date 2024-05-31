/**
 */
package pim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pim.IntermediatePackage;
import pim.TimerSubPath;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer Sub Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pim.impl.TimerSubPathImpl#getTriggerAfterSeconds <em>Trigger After Seconds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimerSubPathImpl extends EventDependentSubPathImpl implements TimerSubPath {
	/**
	 * The default value of the '{@link #getTriggerAfterSeconds() <em>Trigger After Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerAfterSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final double TRIGGER_AFTER_SECONDS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTriggerAfterSeconds() <em>Trigger After Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerAfterSeconds()
	 * @generated
	 * @ordered
	 */
	protected double triggerAfterSeconds = TRIGGER_AFTER_SECONDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerSubPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediatePackage.Literals.TIMER_SUB_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTriggerAfterSeconds() {
		return triggerAfterSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerAfterSeconds(double newTriggerAfterSeconds) {
		double oldTriggerAfterSeconds = triggerAfterSeconds;
		triggerAfterSeconds = newTriggerAfterSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.TIMER_SUB_PATH__TRIGGER_AFTER_SECONDS, oldTriggerAfterSeconds, triggerAfterSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntermediatePackage.TIMER_SUB_PATH__TRIGGER_AFTER_SECONDS:
				return getTriggerAfterSeconds();
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
			case IntermediatePackage.TIMER_SUB_PATH__TRIGGER_AFTER_SECONDS:
				setTriggerAfterSeconds((Double)newValue);
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
			case IntermediatePackage.TIMER_SUB_PATH__TRIGGER_AFTER_SECONDS:
				setTriggerAfterSeconds(TRIGGER_AFTER_SECONDS_EDEFAULT);
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
			case IntermediatePackage.TIMER_SUB_PATH__TRIGGER_AFTER_SECONDS:
				return triggerAfterSeconds != TRIGGER_AFTER_SECONDS_EDEFAULT;
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
		result.append(" (triggerAfterSeconds: ");
		result.append(triggerAfterSeconds);
		result.append(')');
		return result.toString();
	}

} //TimerSubPathImpl
