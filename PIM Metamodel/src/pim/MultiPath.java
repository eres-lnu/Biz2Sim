/**
 */
package pim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pim.MultiPath#getLogicalOperator <em>Logical Operator</em>}</li>
 *   <li>{@link pim.MultiPath#getPathtoken <em>Pathtoken</em>}</li>
 * </ul>
 *
 * @see pim.IntermediatePackage#getMultiPath()
 * @model
 * @generated
 */
public interface MultiPath extends IOElement {
	/**
	 * Returns the value of the '<em><b>Logical Operator</b></em>' attribute.
	 * The default value is <code>"XOR"</code>.
	 * The literals are from the enumeration {@link pim.LogicalOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Operator</em>' attribute.
	 * @see pim.LogicalOperator
	 * @see #setLogicalOperator(LogicalOperator)
	 * @see pim.IntermediatePackage#getMultiPath_LogicalOperator()
	 * @model default="XOR"
	 * @generated
	 */
	LogicalOperator getLogicalOperator();

	/**
	 * Sets the value of the '{@link pim.MultiPath#getLogicalOperator <em>Logical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Operator</em>' attribute.
	 * @see pim.LogicalOperator
	 * @see #getLogicalOperator()
	 * @generated
	 */
	void setLogicalOperator(LogicalOperator value);

	/**
	 * Returns the value of the '<em><b>Pathtoken</b></em>' containment reference list.
	 * The list contents are of type {@link pim.PathToken}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pathtoken</em>' containment reference list.
	 * @see pim.IntermediatePackage#getMultiPath_Pathtoken()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<PathToken> getPathtoken();

} // MultiPath
