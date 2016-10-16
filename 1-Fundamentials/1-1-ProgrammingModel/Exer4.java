if(a > b) then c = 0;       //Remove 'then'
if a > b { c = 0; }         //if(a > b)
if(a > b) c = 0;            //Right
if(a > b) c = 0 else b = 0; //missing ";" after "c = 0"