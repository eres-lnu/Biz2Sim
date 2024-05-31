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
import pim.LogicalOperator;
import pim.MultiPath;
import pim.OutputElement;
import pim.PathToken;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pim.impl.MultiPathImpl#getName <em>Name</em>}</li>
 *   <li>{@link pim.impl.MultiPathImpl#getNextelement <em>Nextelement</em>}</li>
 *   <li>{@link pim.impl.MultiPathImpl#getLogicalOperator <em>Logical Operator</em>}</li>
 *   <li>{@link pim.impl.MultiPathImpl#getPathtoken <em>Pathtoken</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiPathImpl extends MinimalEObjectImpl.Container implements MultiPath {
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
	 * The default value of the '{@link #getLogicalOperator() <em>Logical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOperator()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalOperator LOGICAL_OPERATOR_EDEFAULT = LogicalOperator.XOR;

	/**
	 * The cached value of the '{@link #getLogicalOperator() <em>Logical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOperator()
	 * @generated
	 * @ordered
	 */
	protected LogicalOperator logicalOperator = LOGICAL_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPathtoken() <em>Pathtoken</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathtoken()
	 * @generated
	 * @ordered
	 */
	protected EList<PathToken> pathtoken;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediatePackage.Literals.MULTI_PATH;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.MULTI_PATH__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediatePackage.MULTI_PATH__NEXTELEMENT, oldNextelement, newNextelement);
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
				msgs = ((InternalEObject)nextelement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.MULTI_PATH__NEXTELEMENT, null, msgs);
			if (newNextelement != null)
				msgs = ((InternalEObject)newNextelement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntermediatePackage.MULTI_PATH__NEXTELEMENT, null, msgs);
			msgs = basicSetNextelement(newNextelement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.MULTI_PATH__NEXTELEMENT, newNextelement, newNextelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperator getLogicalOperator() {
		return logicalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalOperator(LogicalOperator newLogicalOperator) {
		LogicalOperator oldLogicalOperator = logicalOperator;
		logicalOperator = newLogicalOperator == null ? LOGICAL_OPERATOR_EDEFAULT : newLogicalOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediatePackage.MULTI_PATH__LOGICAL_OPERATOR, oldLogicalOperator, logicalOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathToken> getPathtoken() {
		if (pathtoken == null) {
			pathtoken = new EObjectContainmentEList<PathToken>(PathToken.class, this, IntermediatePackage.MULTI_PATH__PATHTOKEN);
		}
		return pathtoken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediatePackage.MULTI_PATH__NEXTELEMENT:
				return basicSetNextelement(null, msgs);
			case IntermediatePackage.MULTI_PATH__PATHTOKEN:
				return ((InternalEList<?>)getPathtoken()).basicRemove(otherEnd, msgs);
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
			case IntermediatePackage.MULTI_PATH__NAME:
				return getName();
			case IntermediatePackage.MULTI_PATH__NEXTELEMENT:
				return getNextelement();
			case IntermediatePackage.MULTI_PATH__LOGICAL_OPERATOR:
				return getLogicalOperator();
			case IntermediatePackage.MULTI_PATH__PATHTOKEN:
				return getPathtoken();
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
			case IntermediatePackage.MULTI_PATH__NAME:
				setName((String)newValue);
				return;
			case IntermediatePackage.MULTI_PATH__NEXTELEMENT:
				setNextelement((InputElement)newValue);
				return;
			case IntermediatePackage.MULTI_PATH__LOGICAL_OPERATOR:
				setLogicalOperator((LogicalOperator)newValue);
				return;
			case IntermediatePackage.MULTI_PATH__PATHTOKEN:
				getPathtoken().clear();
				getPathtoken().addAll((Collection<? extends PathToken>)newValue);
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
			case IntermediatePackage.MULTI_PATH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IntermediatePackage.MULTI_PATH__NEXTELEMENT:
				setNextelement((InputElement)null);
				return;
			case IntermediatePackage.MULTI_PATH__LOGICAL_OPERATOR:
				setLogicalOperator(LOGICAL_OPERATOR_EDEFAULT);
				return;
			case IntermediatePackage.MULTI_PATH__PATHTOKEN:
				getPathtoken().clear();
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
			case IntermediatePackage.MULTI_PATH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IntermediatePackage.MULTI_PATH__NEXTELEMENT:
				return nextelement != null;
			case IntermediatePackage.MULTI_PATH__LOGICAL_OPERATOR:
				return logicalOperator != LOGICAL_OPERATOR_EDEFAULT;
			case IntermediatePackage.MULTI_PATH__PATHTOKEN:
				return pathtoken != null && !pathtoken.isEmpty();
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
				case IntermediatePackage.MULTI_PATH__NEXTELEMENT: return IntermediatePackage.OUTPUT_ELEMENT__NEXTELEMENT;
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
				case IntermediatePackage.OUTPUT_ELEMENT__NEXTELEMENT: return IntermediatePackage.MULTI_PATH__NEXTELEMENT;
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
		result.append(", logicalOperator: ");
		result.append(logicalOperator);
		result.append(')');
		return result.toString();
	}

} //MultiPathImpl
