

// [Client]
public main(){
	TreeFactory factory = new Factory();

	TreeType t1 = factory.getTreeType("Дуб"); 
    TreeType t2 = factory.getTreeType("Сосна");
    TreeType t3 = factory.getTreeType("Дуб");

	t1.draw(10, 10); 
	t2.draw(12, 12);
	t3.draw(50, 80);

}

// [Flyweight]

	public class TreeType{
		private String name;
		private String otherTreeData;

		[Constructor]

		public void draw(int x, int y){
			sout(draw...)
		}
	}


// [FlyweightFabric]

	public class TreeFactory{
		private static Map<String, TreeType> treeTypes = new ConcurentHashMap<>();

		public static TreeType getTreetype(String name, String otherData) {

			if(!treeTypes.containsKey(name)) {
				treeTypes.put(name, newTree());
			}
			return treeTypes.get(name);
		}
	}
