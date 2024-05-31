/**
 */
package pim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pim.ErrorSubPath;
import pim.IntermediatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Sub Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pim.impl.ErrorSubPathImpl#getErrorDescription <em>Error Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorSubPathImpl extends EventDependentSubPathImpl implements ErrorSubPath {
	/**
	 * The default value of the '{@link #getErrorDescription() <em>Error Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorDescription() <em>Error Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorDescription()
	 * @generated
	 * @ordered
	 */
	protected String errorDescription = ERROR_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorSubPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediatePackage.Literals.ERROR_SUB_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrorDescription() {
		return errorDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorDescription(String newErrorDescription) {
		String oldErrorDescription = errorDescription;
		errorDescription = newErrorDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.ERROR_SUB_PATH__ERROR_DESCRIPTION, oldErrorDescription, errorDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntermediatePackage.ERROR_SUB_PATH__ERROR_DESCRIPTION:
				return getErrorDescription();
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
			case IntermediatePackage.ERROR_SUB_PATH__ERROR_DESCRIPTION:
				setErrorDescription((String)newValue);
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
			case IntermediatePackage.ERROR_SUB_PATH__ERROR_DESCRIPTION:
				setErrorDescription(ERROR_DESCRIPTION_EDEFAULT);
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
			case IntermediatePackage.ERROR_SUB_PATH__ERROR_DESCRIPTION:
				return ERROR_DESCRIPTION_EDEFAULT == null ? errorDescription != null : !ERROR_DESCRIPTION_EDEFAULT.equals(errorDescription);
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
		result.append(" (errorDescription: ");
		result.append(errorDescription);
		result.append(')');
		return result.toString();
	}

} //ErrorSubPathImpl
