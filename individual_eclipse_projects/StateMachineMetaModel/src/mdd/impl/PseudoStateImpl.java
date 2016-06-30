/**
 */
package mdd.impl;

import mdd.MddPackage;
import mdd.PseudoState;
import mdd.PseudoStateKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pseudo State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdd.impl.PseudoStateImpl#getPseudoStateKind <em>Pseudo State Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PseudoStateImpl extends VertexImpl implements PseudoState {
	/**
	 * The default value of the '{@link #getPseudoStateKind() <em>Pseudo State Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudoStateKind()
	 * @generated
	 * @ordered
	 */
	protected static final PseudoStateKind PSEUDO_STATE_KIND_EDEFAULT = PseudoStateKind.INITIAL;

	/**
	 * The cached value of the '{@link #getPseudoStateKind() <em>Pseudo State Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudoStateKind()
	 * @generated
	 * @ordered
	 */
	protected PseudoStateKind pseudoStateKind = PSEUDO_STATE_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PseudoStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MddPackage.Literals.PSEUDO_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudoStateKind getPseudoStateKind() {
		return pseudoStateKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPseudoStateKind(PseudoStateKind newPseudoStateKind) {
		PseudoStateKind oldPseudoStateKind = pseudoStateKind;
		pseudoStateKind = newPseudoStateKind == null ? PSEUDO_STATE_KIND_EDEFAULT : newPseudoStateKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MddPackage.PSEUDO_STATE__PSEUDO_STATE_KIND, oldPseudoStateKind, pseudoStateKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MddPackage.PSEUDO_STATE__PSEUDO_STATE_KIND:
				return getPseudoStateKind();
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
			case MddPackage.PSEUDO_STATE__PSEUDO_STATE_KIND:
				setPseudoStateKind((PseudoStateKind)newValue);
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
			case MddPackage.PSEUDO_STATE__PSEUDO_STATE_KIND:
				setPseudoStateKind(PSEUDO_STATE_KIND_EDEFAULT);
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
			case MddPackage.PSEUDO_STATE__PSEUDO_STATE_KIND:
				return pseudoStateKind != PSEUDO_STATE_KIND_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pseudoStateKind: ");
		result.append(pseudoStateKind);
		result.append(')');
		return result.toString();
	}

} //PseudoStateImpl
