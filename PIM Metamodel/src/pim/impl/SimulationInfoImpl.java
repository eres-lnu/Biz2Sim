/**
 */
package pim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pim.InterarrivalTimeDescriptor;
import pim.IntermediatePackage;
import pim.SimulationInfo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulation Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pim.impl.SimulationInfoImpl#getRunTime <em>Run Time</em>}</li>
 *   <li>{@link pim.impl.SimulationInfoImpl#getName <em>Name</em>}</li>
 *   <li>{@link pim.impl.SimulationInfoImpl#getInterarrivaltimedescriptor <em>Interarrivaltimedescriptor</em>}</li>
 *   <li>{@link pim.impl.SimulationInfoImpl#getMaxEntities <em>Max Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulationInfoImpl extends MinimalEObjectImpl.Container implements SimulationInfo {
	/**
	 * The default value of the '{@link #getRunTime() <em>Run Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunTime()
	 * @generated
	 * @ordered
	 */
	protected static final double RUN_TIME_EDEFAULT = 10.0;

	/**
	 * The cached value of the '{@link #getRunTime() <em>Run Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunTime()
	 * @generated
	 * @ordered
	 */
	protected double runTime = RUN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The cached value of the '{@link #getInterarrivaltimedescriptor() <em>Interarrivaltimedescriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterarrivaltimedescriptor()
	 * @generated
	 * @ordered
	 */
	protected InterarrivalTimeDescriptor interarrivaltimedescriptor;

	/**
	 * The default value of the '{@link #getMaxEntities() <em>Max Entities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEntities()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ENTITIES_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getMaxEntities() <em>Max Entities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEntities()
	 * @generated
	 * @ordered
	 */
	protected int maxEntities = MAX_ENTITIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediatePackage.Literals.SIMULATION_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRunTime() {
		return runTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunTime(double newRunTime) {
		double oldRunTime = runTime;
		runTime = newRunTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.SIMULATION_INFO__RUN_TIME, oldRunTime, runTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.SIMULATION_INFO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterarrivalTimeDescriptor getInterarrivaltimedescriptor() {
		return interarrivaltimedescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterarrivaltimedescriptor(InterarrivalTimeDescriptor newInterarrivaltimedescriptor, NotificationChain msgs) {
		InterarrivalTimeDescriptor oldInterarrivaltimedescriptor = interarrivaltimedescriptor;
		interarrivaltimedescriptor = newInterarrivaltimedescriptor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediatePackage.SIMULATION_INFO__INTERARRIVALTIMEDESCRIPTOR, oldInterarrivaltimedescriptor, newInterarrivaltimedescriptor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterarrivaltimedescriptor(InterarrivalTimeDescriptor newInterarrivaltimedescriptor) {
		if (newInterarrivaltimedescriptor != interarrivaltimedescriptor) {
			NotificationChain msgs = null;
			if (interarrivaltimedescriptor != null)
				msgs = ((InternalEObject)interarrivaltimedescriptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.SIMULATION_INFO__INTERARRIVALTIMEDESCRIPTOR, null, msgs);
			if (newInterarrivaltimedescriptor != null)
				msgs = ((InternalEObject)newInterarrivaltimedescriptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.SIMULATION_INFO__INTERARRIVALTIMEDESCRIPTOR, null, msgs);
			msgs = basicSetInterarrivaltimedescriptor(newInterarrivaltimedescriptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.SIMULATION_INFO__INTERARRIVALTIMEDESCRIPTOR, newInterarrivaltimedescriptor, newInterarrivaltimedescriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxEntities() {
		return maxEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxEntities(int newMaxEntities) {
		int oldMaxEntities = maxEntities;
		maxEntities = newMaxEntities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.SIMULATION_INFO__MAX_ENTITIES, oldMaxEntities, maxEntities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediatePackage.SIMULATION_INFO__INTERARRIVALTIMEDESCRIPTOR:
				return basicSetInterarrivaltimedescriptor(null, msgs);
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
			case IntermediatePackage.SIMULATION_INFO__RUN_TIME:
				return getRunTime();
			case IntermediatePackage.SIMULATION_INFO__NAME:
				return getName();
			case IntermediatePackage.SIMULATION_INFO__INTERARRIVALTIMEDESCRIPTOR:
				return getInterarrivaltimedescriptor();
			case IntermediatePackage.SIMULATION_INFO__MAX_ENTITIES:
				return getMaxEntities();
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
			case IntermediatePackage.SIMULATION_INFO__RUN_TIME:
				setRunTime((Double)newValue);
				return;
			case IntermediatePackage.SIMULATION_INFO__NAME:
				setName((String)newValue);
				return;
			case IntermediatePackage.SIMULATION_INFO__INTERARRIVALTIMEDESCRIPTOR:
				setInterarrivaltimedescriptor((InterarrivalTimeDescriptor)newValue);
				return;
			case IntermediatePackage.SIMULATION_INFO__MAX_ENTITIES:
				setMaxEntities((Integer)newValue);
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
			case IntermediatePackage.SIMULATION_INFO__RUN_TIME:
				setRunTime(RUN_TIME_EDEFAULT);
				return;
			case IntermediatePackage.SIMULATION_INFO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IntermediatePackage.SIMULATION_INFO__INTERARRIVALTIMEDESCRIPTOR:
				setInterarrivaltimedescriptor((InterarrivalTimeDescriptor)null);
				return;
			case IntermediatePackage.SIMULATION_INFO__MAX_ENTITIES:
				setMaxEntities(MAX_ENTITIES_EDEFAULT);
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
			case IntermediatePackage.SIMULATION_INFO__RUN_TIME:
				return runTime != RUN_TIME_EDEFAULT;
			case IntermediatePackage.SIMULATION_INFO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IntermediatePackage.SIMULATION_INFO__INTERARRIVALTIMEDESCRIPTOR:
				return interarrivaltimedescriptor != null;
			case IntermediatePackage.SIMULATION_INFO__MAX_ENTITIES:
				return maxEntities != MAX_ENTITIES_EDEFAULT;
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
		result.append(" (runTime: ");
		result.append(runTime);
		result.append(", name: ");
		result.append(name);
		result.append(", maxEntities: ");
		result.append(maxEntities);
		result.append(')');
		return result.toString();
	}

} //SimulationInfoImpl
