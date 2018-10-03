package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class tageHook {

	@Before("@second")//(order= 0)
	public void saturday(){
		System.out.println("world");
	}
	@After("@second")//(order= 0)
	public void sunday(){
		System.out.println("heyworld");
		
	}
	
	
	@Before("@first")
	public void wednesday(){
		System.out.println("world2");
	}
	@After("@first")
	public void thursday(){
		System.out.println("heyworld1");
		
	}
	@Given("^vishal homepages$")
	public void vishal_homepages()  {
		System.out.println("a");
	   
	}

	@When("^bhardwaj vishal$")
	public void bhardwaj_vishal()  {
		System.out.println("b");
	}

	@Given("^bhardwaj contacts pages$")
	public void bhardwaj_contacts_pages() {
		System.out.println("c");
	}

	@When("^vishal bhardwaj$")
	public void vishal_bhardwaj()  {
		System.out.println("d");
	}
	


}
