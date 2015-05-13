package pp.block3.cc.symbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySymbolTable implements SymbolTable {
	
	public MySymbolTable(){
		scopes.put(0, new ArrayList<String>());
	}
	
	Map<Integer, List<String>>  scopes = new HashMap<Integer, List<String>>();
	int scopelevel = 0;

	@Override
	public void openScope() {
		scopelevel++;
		scopes.put(scopelevel, new ArrayList<String>());
		
	}

	@Override
	public void closeScope() {
		if(scopelevel == 0){
			throw new RuntimeException("Can't close top-level scope");
		}
		scopes.remove(scopelevel);
		scopelevel--;
		
		
		
	}

	@Override
	public boolean add(String id) {
		if (scopes.get(scopelevel).contains(id))
			return false;
		else {
			scopes.get(scopelevel).add(id);
			return true;
		}
	}

	@Override
	public boolean contains(String id) {
		boolean result = false;
		for (int i = scopelevel; i >= 0; i--){
			result |= scopes.get(i).contains(id);
		}		
		return result;
	}

}
