/**
 */
package pim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pim.SimpleActivity#getMessagesubpath <em>Messagesubpath</em>}</li>
 *   <li>{@link pim.SimpleActivity#getTimersubpath <em>Timersubpath</em>}</li>
 *   <li>{@link pim.SimpleActivity#getErrorsubpath <em>Errorsubpath</em>}</li>
 *   <li>{@link pim.SimpleActivity#getSignalsubpath <em>Signalsubpath</em>}</li>
 * </ul>
 *
 * @see pim.IntermediatePackage#getSimpleActivity()
 * @model
 * @generated
 */
public interface SimpleActivity extends Activity {
	/**
	 * Returns the value of the '<em><b>Messagesubpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messagesubpath</em>' containment reference.
	 * @see #setMessagesubpath(MessageSubPath)
	 * @see pim.IntermediatePackage#getSimpleActivity_Messagesubpath()
	 * @model containment="true"
	 * @generated
	 */
	MessageSubPath getMessagesubpath();

	/**
	 * Sets the value of the '{@link pim.SimpleActivity#getMessagesubpath <em>Messagesubpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Messagesubpath</em>' containment reference.
	 * @see #getMessagesubpath()
	 * @generated
	 */
	void setMessagesubpath(MessageSubPath value);

	/**
	 * Returns the value of the '<em><b>Timersubpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timersubpath</em>' containment reference.
	 * @see #setTimersubpath(TimerSubPath)
	 * @see pim.IntermediatePackage#getSimpleActivity_Timersubpath()
	 * @model containment="true"
	 * @generated
	 */
	TimerSubPath getTimersubpath();

	/**
	 * Sets the value of the '{@link pim.SimpleActivity#getTimersubpath <em>Timersubpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timersubpath</em>' containment reference.
	 * @see #getTimersubpath()
	 * @generated
	 */
	void setTimersubpath(TimerSubPath value);

	/**
	 * Returns the value of the '<em><b>Errorsubpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errorsubpath</em>' containment reference.
	 * @see #setErrorsubpath(ErrorSubPath)
	 * @see pim.IntermediatePackage#getSimpleActivity_Errorsubpath()
	 * @model containment="true"
	 * @generated
	 */
	ErrorSubPath getErrorsubpath();

	/**
	 * Sets the value of the '{@link pim.SimpleActivity#getErrorsubpath <em>Errorsubpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Errorsubpath</em>' containment reference.
	 * @see #getErrorsubpath()
	 * @generated
	 */
	void setErrorsubpath(ErrorSubPath value);

	/**
	 * Returns the value of the '<em><b>Signalsubpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalsubpath</em>' containment reference.
	 * @see #setSignalsubpath(SignalSubPath)
	 * @see pim.IntermediatePackage#getSimpleActivity_Signalsubpath()
	 * @model containment="true"
	 * @generated
	 */
	SignalSubPath getSignalsubpath();

	/**
	 * Sets the value of the '{@link pim.SimpleActivity#getSignalsubpath <em>Signalsubpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalsubpath</em>' containment reference.
	 * @see #getSignalsubpath()
	 * @generated
	 */
	void setSignalsubpath(SignalSubPath value);

} // SimpleActivity
