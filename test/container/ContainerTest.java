/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 *
 * @author Ainur
 */

@RunWith(Suite.class)
@SuiteClasses({ContainerBagTest.class, ContainerBoxTest.class, ContainerStackTest.class, ContainerItem.class})

public class ContainerTest {
public static void main(String[] args) {		
	}
}
