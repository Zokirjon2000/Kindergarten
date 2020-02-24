package Kindergarten;

import Kindergarten.Implement.AllreferenceImpl;
import Kindergarten.Implement.EmployeeImpe;
import Kindergarten.Interface.AllReference;
import Kindergarten.Interface.Employee1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KindergartenMain {


    public static void main(String[] args) {
        AllReference allReference = new AllreferenceImpl();
        Scanner sc = new Scanner(System.in);
        Employee1 employee1 = new EmployeeImpe();


        while (true) {
            System.out.println(
                    " 1-> Employee " +
                            " 2-> AllChild " +
                            " 3-> Show AllEmployee " +
                            " 4-> Show AllChild " +
                            " 5-> RegistrationGroup " +
                            " 6-> Sort Child " +
                            " 7-> deleteChild " +
                            " 8-> EditChild ");

            int n = sc.nextInt();
            switch (n) {
                case 1:
                    employee1.Employee();
                    break;
                case 2:
                    allReference.AllChild();
                    break;
                case 3:
                    employee1.AllEmployee();
                    break;
                case 4:
                    allReference.ShowAllChild();
                    break;
                case 5:
                    allReference.RegistrationGroup();
                    break;
                case 6:
                    allReference.sortChilds();
                    break;
                case 7:
                    allReference.DeleteChild();
                    break;
                case 8:
                    allReference.EditChild();
                    break;

            }
        }
    }
}
