/**
 */
package org.example.school.school;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>School</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.school.school.School#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @see org.example.school.school.SchoolPackage#getSchool()
 * @model
 * @generated
 */
public interface School extends Named {
	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link org.example.school.school.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see org.example.school.school.SchoolPackage#getSchool_Persons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

} // School
