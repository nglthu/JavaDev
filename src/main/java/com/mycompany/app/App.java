/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;
import java.util.ArrayList;

import com.mycompany.app.student.Student;



public class App {
    public static void main(String[] args) {
        System.out.println("Hello Remote World!");
        
        ArrayList<Student> lsv = new ArrayList<Student>();


        Student sv1= new Student();
        
        sv1.fullname = "Nguyen";
        sv2.studentID = "masv123";
       // Student sv2 = new Student('dddeee', 'ddde34444');

    lsv.add(sv1);
   // lsv.add(sv2);

    System.out.println(lsv.get(0).fullname);


    }
}
