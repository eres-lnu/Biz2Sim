/**
 */
package pim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer Sub Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pim.TimerSubPath#getTriggerAfterSeconds <em>Trigger After Seconds</em>}</li>
 * </ul>
 *
 * @see pim.IntermediatePackage#getTimerSubPath()
 * @model
 * @generated
 */
public interface TimerSubPath extends EventDependentSubPath {
	/**
	 * Returns the value of the '<em><b>Trigger After Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger After Seconds</em>' attribute.
	 * @see #setTriggerAfterSeconds(double)
	 * @see pim.IntermediatePackage#getTimerSubPath_TriggerAfterSeconds()
	 * @model
	 * @generated
	 */
	double getTriggerAfterSeconds();

	/**
	 * Sets the value of the '{@link pim.TimerSubPath#getTriggerAfterSeconds <em>Trigger After Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger After Seconds</em>' attribute.
	 * @see #getTriggerAfterSeconds()
	 * @generated
	 */
	void setTriggerAfterSeconds(double value);

} // TimerSubPath
