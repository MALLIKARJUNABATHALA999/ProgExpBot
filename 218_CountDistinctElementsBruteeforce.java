Public Solution{
	int countDistinctElements(int[] arr){
	int res=0;
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<i;j++){
		if(arr[i]==arr[j]){
			flag=true;
			break;
		}}
	}
	if(flag==false){
			res++;
				}
return res;
}
}