/**
 */
package pim.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import pim.IntermediatePackage;
import pim.ResourceDescriptor;
import pim.TimeDistribution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pim.impl.ResourceDescriptorImpl#getServiceTimeDistributionType <em>Service Time Distribution Type</em>}</li>
 *   <li>{@link pim.impl.ResourceDescriptorImpl#getServiceTimeDistributionParameters <em>Service Time Distribution Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceDescriptorImpl extends MinimalEObjectImpl.Container implements ResourceDescriptor {
	/**
	 * The default value of the '{@link #getServiceTimeDistributionType() <em>Service Time Distribution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTimeDistributionType()
	 * @generated
	 * @ordered
	 */
	protected static final TimeDistribution SERVICE_TIME_DISTRIBUTION_TYPE_EDEFAULT = TimeDistribution.EXPONENTIAL;

	/**
	 * The cached value of the '{@link #getServiceTimeDistributionType() <em>Service Time Distribution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTimeDistributionType()
	 * @generated
	 * @ordered
	 */
	protected TimeDistribution serviceTimeDistributionType = SERVICE_TIME_DISTRIBUTION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceTimeDistributionParameters() <em>Service Time Distribution Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTimeDistributionParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> serviceTimeDistributionParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediatePackage.Literals.RESOURCE_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDistribution getServiceTimeDistributionType() {
		return serviceTimeDistributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceTimeDistributionType(TimeDistribution newServiceTimeDistributionType) {
		TimeDistribution oldServiceTimeDistributionType = serviceTimeDistributionType;
		serviceTimeDistributionType = newServiceTimeDistributionType == null ? SERVICE_TIME_DISTRIBUTION_TYPE_EDEFAULT : newServiceTimeDistributionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.RESOURCE_DESCRIPTOR__SERVICE_TIME_DISTRIBUTION_TYPE, oldServiceTimeDistributionType, serviceTimeDistributionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getServiceTimeDistributionParameters() {
		if (serviceTimeDistributionParameters == null) {
			serviceTimeDistributionParameters = new EDataTypeUniqueEList<Double>(Double.class, this, IntermediatePackage.RESOURCE_DESCRIPTOR__SERVICE_TIME_DISTRIBUTION_PARAMETERS);
		}
		return serviceTimeDistributionParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntermediatePackage.RESOURCE_DESCRIPTOR__SERVICE_TIME_DISTRIBUTION_TYPE:
				return getServiceTimeDistributionType();
			case IntermediatePackage.RESOURCE_DESCRIPTOR__SERVICE_TIME_DISTRIBUTION_PARAMETERS:
				return getServiceTimeDistributionParameters();
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
			case IntermediatePackage.RESOURCE_DESCRIPTOR__SERVICE_TIME_DISTRIBUTION_TYPE:
				setServiceTimeDistributionType((TimeDistribution)newValue);
				return;
			case IntermediatePackage.RESOURCE_DESCRIPTOR__SERVICE_TIME_DISTRIBUTION_PARAMETERS:
				getServiceTimeDistributionParameters().clear();
				getServiceTimeDistributionParameters().addAll((Collection<? extends Double>)newValue);
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
			case IntermediatePackage.RESOURCE_DESCRIPTOR__SERVICE_TIME_DISTRIBUTION_TYPE:
				setServiceTimeDistributionType(SERVICE_TIME_DISTRIBUTION_TYPE_EDEFAULT);
				return;
			case IntermediatePackage.RESOURCE_DESCRIPTOR__SERVICE_TIME_DISTRIBUTION_PARAMETERS:
				getServiceTimeDistributionParameters().clear();
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
			case IntermediatePackage.RESOURCE_DESCRIPTOR__SERVICE_TIME_DISTRIBUTION_TYPE:
				return serviceTimeDistributionType != SERVICE_TIME_DISTRIBUTION_TYPE_EDEFAULT;
			case IntermediatePackage.RESOURCE_DESCRIPTOR__SERVICE_TIME_DISTRIBUTION_PARAMETERS:
				return serviceTimeDistributionParameters != null && !serviceTimeDistributionParameters.isEmpty();
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
		result.append(" (serviceTimeDistributionType: ");
		result.append(serviceTimeDistributionType);
		result.append(", serviceTimeDistributionParameters: ");
		result.append(serviceTimeDistributionParameters);
		result.append(')');
		return result.toString();
	}

} //ResourceDescriptorImpl
