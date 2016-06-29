/**
 */
package mdd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdd.State#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link mdd.State#isIsOrthogonal <em>Is Orthogonal</em>}</li>
 *   <li>{@link mdd.State#isIsSimple <em>Is Simple</em>}</li>
 *   <li>{@link mdd.State#isIsSubmachineState <em>Is Submachine State</em>}</li>
 *   <li>{@link mdd.State#getRegion <em>Region</em>}</li>
 *   <li>{@link mdd.State#getDeferrableTrigger <em>Deferrable Trigger</em>}</li>
 *   <li>{@link mdd.State#getEntry <em>Entry</em>}</li>
 *   <li>{@link mdd.State#getExit <em>Exit</em>}</li>
 *   <li>{@link mdd.State#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link mdd.State#getStateInvariant <em>State Invariant</em>}</li>
 * </ul>
 *
 * @see mdd.MddPackage#getState()
 * @model
 * @generated
 */
public interface State extends Vertex {
	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Composite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see mdd.MddPackage#getState_IsComposite()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	boolean isIsComposite();

	/**
	 * Returns the value of the '<em><b>Is Orthogonal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Orthogonal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Orthogonal</em>' attribute.
	 * @see mdd.MddPackage#getState_IsOrthogonal()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	boolean isIsOrthogonal();

	/**
	 * Returns the value of the '<em><b>Is Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Simple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Simple</em>' attribute.
	 * @see mdd.MddPackage#getState_IsSimple()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	boolean isIsSimple();

	/**
	 * Returns the value of the '<em><b>Is Submachine State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Submachine State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Submachine State</em>' attribute.
	 * @see mdd.MddPackage#getState_IsSubmachineState()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	boolean isIsSubmachineState();

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link mdd.Region}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see mdd.MddPackage#getState_Region()
	 * @model containment="true"
	 * @generated
	 */
	EList<Region> getRegion();

	/**
	 * Returns the value of the '<em><b>Deferrable Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link mdd.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deferrable Trigger</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deferrable Trigger</em>' containment reference list.
	 * @see mdd.MddPackage#getState_DeferrableTrigger()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getDeferrableTrigger();

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference.
	 * @see #setEntry(Behavior)
	 * @see mdd.MddPackage#getState_Entry()
	 * @model containment="true"
	 * @generated
	 */
	Behavior getEntry();

	/**
	 * Sets the value of the '{@link mdd.State#getEntry <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' containment reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(Behavior value);

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' containment reference.
	 * @see #setExit(Behavior)
	 * @see mdd.MddPackage#getState_Exit()
	 * @model containment="true"
	 * @generated
	 */
	Behavior getExit();

	/**
	 * Sets the value of the '{@link mdd.State#getExit <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' containment reference.
	 * @see #getExit()
	 * @generated
	 */
	void setExit(Behavior value);

	/**
	 * Returns the value of the '<em><b>Do Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Activity</em>' containment reference.
	 * @see #setDoActivity(Behavior)
	 * @see mdd.MddPackage#getState_DoActivity()
	 * @model containment="true"
	 * @generated
	 */
	Behavior getDoActivity();

	/**
	 * Sets the value of the '{@link mdd.State#getDoActivity <em>Do Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Activity</em>' containment reference.
	 * @see #getDoActivity()
	 * @generated
	 */
	void setDoActivity(Behavior value);

	/**
	 * Returns the value of the '<em><b>State Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Invariant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Invariant</em>' containment reference.
	 * @see #setStateInvariant(Constraint)
	 * @see mdd.MddPackage#getState_StateInvariant()
	 * @model containment="true"
	 * @generated
	 */
	Constraint getStateInvariant();

	/**
	 * Sets the value of the '{@link mdd.State#getStateInvariant <em>State Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Invariant</em>' containment reference.
	 * @see #getStateInvariant()
	 * @generated
	 */
	void setStateInvariant(Constraint value);

} // State
