package functionalInterface.FunctionalInterfaceWithInheritance;

@FunctionalInterface
public interface IChild extends IParent{

//	void love(); even though this is single abstract method in child interface 
//	as we extended the parent interface we cannot have separate SAM because the SAM already present in parent is being inherited by child

	void care(); // we can have same method present in IParent interface , simply like overriding 
	
}
