package pp.block1.cc.dfa;

import java.util.ArrayList;
import java.util.List;

public class GeneratorImp implements Generator {
	
	@Override
	public List<String> scan(State dfa, String text) {
		List<String> result = new ArrayList<String>();
		Checker checker = new CheckerImp();
		
		int start = 0;
		while(start != text.length()) {
			int acceptIndex = start;
			for(int index = text.length(); index > start; index--) {
				
				if(checker.accepts(dfa, text.substring(start, index))) {
					acceptIndex = index;
					break;
				}
			}
			if(acceptIndex == start) {
				return new ArrayList<String>();
			}
			result.add(text.substring(start, acceptIndex));
			start = acceptIndex;
		}
		
		return result;
	}

}
