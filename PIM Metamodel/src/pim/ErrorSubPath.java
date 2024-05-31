/**
 */
package pim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Sub Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pim.ErrorSubPath#getErrorDescription <em>Error Description</em>}</li>
 * </ul>
 *
 * @see pim.IntermediatePackage#getErrorSubPath()
 * @model
 * @generated
 */
public interface ErrorSubPath extends EventDependentSubPath {
	/**
	 * Returns the value of the '<em><b>Error Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Description</em>' attribute.
	 * @see #setErrorDescription(String)
	 * @see pim.IntermediatePackage#getErrorSubPath_ErrorDescription()
	 * @model
	 * @generated
	 */
	String getErrorDescription();

	/**
	 * Sets the value of the '{@link pim.ErrorSubPath#getErrorDescription <em>Error Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Description</em>' attribute.
	 * @see #getErrorDescription()
	 * @generated
	 */
	void setErrorDescription(String value);

} // ErrorSubPath
