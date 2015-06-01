program gauss;

Var x, result: Integer;

Begin
	In("Upper bound: ", x);
	While x > 0 Do
	Begin
		result := result + x;
		x := x - 1
	End;
	Out("Sum: ", result)
End.