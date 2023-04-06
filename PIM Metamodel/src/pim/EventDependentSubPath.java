/**
 */
package pim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Dependent Sub Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pim.EventDependentSubPath#isInterrupt <em>Interrupt</em>}</li>
 * </ul>
 *
 * @see pim.IntermediatePackage#getEventDependentSubPath()
 * @model abstract="true"
 * @generated
 */
public interface EventDependentSubPath extends OutputOnlyElement {
	/**
	 * Returns the value of the '<em><b>Interrupt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interrupt</em>' attribute.
	 * @see #setInterrupt(boolean)
	 * @see pim.IntermediatePackage#getEventDependentSubPath_Interrupt()
	 * @model
	 * @generated
	 */
	boolean isInterrupt();

	/**
	 * Sets the value of the '{@link pim.EventDependentSubPath#isInterrupt <em>Interrupt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interrupt</em>' attribute.
	 * @see #isInterrupt()
	 * @generated
	 */
	void setInterrupt(boolean value);

} // EventDependentSubPath
