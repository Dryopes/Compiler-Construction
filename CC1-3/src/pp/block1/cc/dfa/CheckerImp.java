package pp.block1.cc.dfa;

public class CheckerImp implements Checker {

	@Override
	public boolean accepts(State start, String word) {
		
		for(int i = 0; i < word.length(); i++) {
			start = start.getNext(word.charAt(i));
			if(start == null) return false;				
		}	
		
		return start.isAccepting();
	}

}
