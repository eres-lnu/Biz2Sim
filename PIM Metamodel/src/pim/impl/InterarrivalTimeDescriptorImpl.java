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

import pim.InputElement;
import pim.InterarrivalTimeDescriptor;
import pim.IntermediatePackage;
import pim.TimeDistribution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interarrival Time Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pim.impl.InterarrivalTimeDescriptorImpl#getName <em>Name</em>}</li>
 *   <li>{@link pim.impl.InterarrivalTimeDescriptorImpl#getNextelement <em>Nextelement</em>}</li>
 *   <li>{@link pim.impl.InterarrivalTimeDescriptorImpl#getDistributionType <em>Distribution Type</em>}</li>
 *   <li>{@link pim.impl.InterarrivalTimeDescriptorImpl#getDistributionParameters <em>Distribution Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterarrivalTimeDescriptorImpl extends MinimalEObjectImpl.Container implements InterarrivalTimeDescriptor {
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
	 * The default value of the '{@link #getDistributionType() <em>Distribution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionType()
	 * @generated
	 * @ordered
	 */
	protected static final TimeDistribution DISTRIBUTION_TYPE_EDEFAULT = TimeDistribution.EXPONENTIAL;

	/**
	 * The cached value of the '{@link #getDistributionType() <em>Distribution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionType()
	 * @generated
	 * @ordered
	 */
	protected TimeDistribution distributionType = DISTRIBUTION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDistributionParameters() <em>Distribution Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> distributionParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterarrivalTimeDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediatePackage.Literals.INTERARRIVAL_TIME_DESCRIPTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__NEXTELEMENT, oldNextelement, newNextelement);
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
				msgs = ((InternalEObject)nextelement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__NEXTELEMENT, null, msgs);
			if (newNextelement != null)
				msgs = ((InternalEObject)newNextelement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__NEXTELEMENT, null, msgs);
			msgs = basicSetNextelement(newNextelement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__NEXTELEMENT, newNextelement, newNextelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDistribution getDistributionType() {
		return distributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistributionType(TimeDistribution newDistributionType) {
		TimeDistribution oldDistributionType = distributionType;
		distributionType = newDistributionType == null ? DISTRIBUTION_TYPE_EDEFAULT : newDistributionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__DISTRIBUTION_TYPE, oldDistributionType, distributionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getDistributionParameters() {
		if (distributionParameters == null) {
			distributionParameters = new EDataTypeUniqueEList<Double>(Double.class, this, IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__DISTRIBUTION_PARAMETERS);
		}
		return distributionParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__NEXTELEMENT:
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
			case IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__NAME:
				return getName();
			case IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__NEXTELEMENT:
				return getNextelement();
			case IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__DISTRIBUTION_TYPE:
				return getDistributionType();
			case IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__DISTRIBUTION_PARAMETERS:
				return getDistributionParameters();
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
			case IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__NAME:
				setName((String)newValue);
				return;
			case IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__NEXTELEMENT:
				setNextelement((InputElement)newValue);
				return;
			case IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__DISTRIBUTION_TYPE:
				setDistributionType((TimeDistribution)newValue);
				return;
			case IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__DISTRIBUTION_PARAMETERS:
				getDistributionParameters().clear();
				getDistributionParameters().addAll((Collection<? extends Double>)newValue);
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
			case IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__NEXTELEMENT:
				setNextelement((InputElement)null);
				return;
			case IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__DISTRIBUTION_TYPE:
				setDistributionType(DISTRIBUTION_TYPE_EDEFAULT);
				return;
			case IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__DISTRIBUTION_PARAMETERS:
				getDistributionParameters().clear();
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
			case IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__NEXTELEMENT:
				return nextelement != null;
			case IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__DISTRIBUTION_TYPE:
				return distributionType != DISTRIBUTION_TYPE_EDEFAULT;
			case IntermediatePackage.INTERARRIVAL_TIME_DESCRIPTOR__DISTRIBUTION_PARAMETERS:
				return distributionParameters != null && !distributionParameters.isEmpty();
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
		result.append(", DistributionType: ");
		result.append(distributionType);
		result.append(", DistributionParameters: ");
		result.append(distributionParameters);
		result.append(')');
		return result.toString();
	}

} //InterarrivalTimeDescriptorImpl
