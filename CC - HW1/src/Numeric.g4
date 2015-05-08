lexer grammar Numeric;

fragment BIN : '0' | '1';
fragment OCT : '0'..'7';
fragment DEC : '0'..'9';
fragment DEC1: '1'..'9';
fragment HEX : '0'..'9' | 'A'..'F';

BININT: 	'0b'(BIN | (BIN (BIN | '_' )* BIN));
OCTINT:		'0'	(OCT | (OCT (OCT | '_' )* OCT));
HEXINT:		'0x'(HEX | (HEX (HEX | '_' )* HEX));
DECINT:		DEC1 | (DEC1 ((DEC | '_')* DEC));

BINLONG:	'0b'(BIN | (BIN (BIN | '_' )* BIN))	('l' | 'L');
OCTLONG: 	'0'	(OCT | (OCT (OCT | '_' )* OCT))	('l' | 'L');
HEXLONG:	'0x'(HEX | (HEX (HEX | '_' )* HEX)) ('l' | 'L');
DECLONG:	(DEC1 | (DEC1 ((DEC | '_')* DEC)))	('l' | 'L');

//Numeric : BININT | OCTINT | HEXINT | DECINT | BINLONG | OCTLONG | HEXLONG | DECLONG;
