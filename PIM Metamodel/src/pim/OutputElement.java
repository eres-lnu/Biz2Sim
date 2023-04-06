/**
 */
package pim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pim.OutputElement#getNextelement <em>Nextelement</em>}</li>
 * </ul>
 *
 * @see pim.IntermediatePackage#getOutputElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface OutputElement extends Element {
	/**
	 * Returns the value of the '<em><b>Nextelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nextelement</em>' containment reference.
	 * @see #setNextelement(InputElement)
	 * @see pim.IntermediatePackage#getOutputElement_Nextelement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputElement getNextelement();

	/**
	 * Sets the value of the '{@link pim.OutputElement#getNextelement <em>Nextelement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nextelement</em>' containment reference.
	 * @see #getNextelement()
	 * @generated
	 */
	void setNextelement(InputElement value);

} // OutputElement
