# Java Design Pattern: Model-View-Controller(MVC)

###### MVC Pattern stands for Model-View-Controller Pattern. This pattern is used to separate application's concerns.

- Model - Model represents an object or JAVA POJO carrying data. It can also have logic to update controller if its data changes.

- View - View represents the visualization of the data that model contains.

- Controller - Controller acts on both model and view. It controls the data flow into model object and updates the view whenever data changes. It keeps view and model separate.

[![Model-View-Controller-pattern](../../../../resources/img/mvc_diagram.jpg)]

### Implementation

###### We are going to create a Student object acting as a model.StudentView will be a view class which can print student details on console and StudentController is the controller class responsible to store data in Student object and update view StudentView accordingly.

###### MVCPatternDemo, our demo class, will use StudentController to demonstrate use of MVC pattern.

###### Based on different parameter, getInstance() returns a different instance of Calendar.


### Output

```sh
Student: 
Name: Robert
Roll No: 10
Student: 
Name: John
Roll No: 10
```

source:
[tutorials-point](https://www.tutorialspoint.com/design_pattern/mvc_pattern.htm#:~:text=MVC%20Pattern%20stands%20for%20Model,or%20JAVA%20POJO%20carrying%20data.) 