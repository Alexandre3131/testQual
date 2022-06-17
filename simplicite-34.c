char* erase(char* chaine) {
  int size = strlen(chaine);
  char Newmot[size];
  int j=0;
  for (int i = 0; i<size ;i++) {
    if (chaine[i]==' ') {
      if ((i+1<size && chaine[i+1] ==' ') || (i!=0 && chaine[i-1] ==' ')){
        Newmot[j]=chaine[i];
        j+=1;
      }
    } 
    else 
    {
      Newmot[j]=chaine[i];
      j+=1;
    }   
  }
  return Newmot; 
}
