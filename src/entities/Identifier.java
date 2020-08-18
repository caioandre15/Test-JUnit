package entities;

public class Identifier {

	public boolean validateIdentifier(String s) {
		char achar;
		boolean valid_id = false;
		if (s.length() > 0) {
			achar = s.charAt(0);
			valid_id = valid_s(achar);
			if (s.length() > 1) {
				achar = s.charAt(1);
				int i = 1;
				while (i < s.length()) {
					achar = s.charAt(i);
					if (!valid_f(achar)) {
						valid_id = false;
					}
					i++;
				}
			}
		}
		return (valid_id && (s.length() >= 1) && (s.length() <= 6));
	}

	public boolean valid_s(char ch) {
		return (((ch >= 'A') && (ch <= 'Z')) || ((ch >= 'a') && (ch <= 'z')));
	}

	public boolean valid_f(char ch) {
		return (((ch >= 'A') && (ch <= 'Z')) || ((ch > 'a') && (ch <= 'z')) || ((ch >= '0') && (ch <= '9')));
	}
}
