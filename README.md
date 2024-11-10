# Employee Management App


The submission is the mendix project compressed in zip 
## Dedendency:
Database : MySQL
The application will only work with mysql db.
The SQL queries as specific to mysql syntax .

The employee and department data is fetch from DB by 
directly query using SQL using Database connector module's ExecuteQuery JavaAction.

### Features Developed

#### Features:

1.Employee Management:
Implement a data model to manage employee information including:
Employee ID, Name, Department, Designation, Date of Joining, Contact Info.
Create CRUD (Create, Read, Update, Delete) functionality for employees.
Use the list widget to list employees and custom enable sorting and searching includes on Employee and department table.


2.Department Hierarchy:
Create a hierarchical structure where each department can have sub-departments.
Ensure that when viewing a department, employees belonging to that department and its sub-departments are displayed.

3.External API Integration:
Integrate an external REST API to fetch the weather of the employee's location (based on their contact information) and display it on the employee detail page.
Use an API service like Open Weather or any public weather API.

4.Implement role-based access control:
Admin users can manage employees and departments.

Managers can only view department details and employee information in their department.
Employees can only view their own information.
Ensure appropriate security settings are configured for entity access and page visibility.

5.Advanced Workflow (Bonus):
Create a microflow that triggers every time a new employee is added, or an existing employee is updated, sending a confirmation email to the employee.
Use Mendix’s Email Module for this functionality.


