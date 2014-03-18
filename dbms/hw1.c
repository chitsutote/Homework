#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int deap[1010];
int height=1;

void insert( int , int );
void heapify();

int main(){
	int i;
	int c;
	int temp[1010];
	int count=0;
	FILE *file;
	file = fopen("deap.in","r");

	while( fscanf(file,"%d",&c)!= -1 ){
		temp[count] = c ;
//		printf("%d\n",temp[count]);
//		printf("count : %d\n",count);
		count++;	
	}

    for(i = 0 ; i < count ; i++){
		insert(temp[i] , i+1 );
	} 
	
	for( i = 1 ; i <= count ; i++){
		printf("Deap[i] : %d\n",deap[i]);
	}
	printf("Height : %d\n",height);
	fclose(file);
	return 0;
}

//Insert a key into deap
void insert(int input, int pos){

	int temp;

	deap[pos] = input;
	if( pos == 2){
		if( input < deap[1] ){
			temp = deap[1];
			deap[1] = input;
			deap[2] = temp;
			height ++;
		}	
	}else if( pos > 2){
		
		if( pos == (pow(2,height)-1) ){
			height++;
		}
	
	}
}
//heapify the left tree or right tree
void heapify(){


}
