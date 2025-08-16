/*Create 4 test methods:
createUser → Sanity
updateUser → Regression
deleteUser → Sanity, Regression
viewUser → Smoke
Run a suite that executes only Sanity and Smoke groups (exclude Regression).
*/



package com.wiprojuly.testing;

import org.testng.annotations.Test;

public class TestNGGroup2 {

    @Test(groups = {"Sanity"})
    public void createUser() {
        System.out.println("Create User Test - Sanity");
    }

    @Test(groups = {"Regression"})
    public void updateUser() {
        System.out.println("Update User Test - Regression");
    }

    @Test(groups = {"Sanity", "Regression"})
    public void deleteUser() {
        System.out.println("Delete User Test - Sanity & Regression");
    }

    @Test(groups = {"Smoke"})
    public void viewUser() {
        System.out.println("View User Test - Smoke");
    }
}

