#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int deap[1010];
int height=0;

void insert(int,int );
int heapify(int,int);

int main(){
	int i;
	int c;
	int temp[1010];
	int count=0;

	for( i = 0 ; i < 1010 ; i++){
		deap[i] = -1;
		temp[i] = -1;
	}
	FILE *file;
	file = fopen("deap.in","r");

	while( fscanf(file,"%d",&c)!= -1 ){
		temp[count] = c ;
		count++;	
	}
	fclose(file);

    for(i = 0 ; i < count ; i++){
		insert(temp[i] , i+2 );
	} 
	
	file = fopen("deap.out","w");
	
	for( i = 2 ; i <= count+1 ; i++){
		fprintf(file,"Deap[%d] : %d\n",i,deap[i]);
	}
	fclose(file);
	return 0;
}

//Insert a key into deap
void insert(int input, int pos){

	int temp;
	int corpos; //corresponding position
	int halfheight = 0;

	deap[pos] = input;
	if( pos == 3){
		if( input < deap[2] ){
			temp = deap[2];
			deap[2] = input;
			deap[3] = temp;
			height++;
		}else{
			height++;
		}

	}else if( pos > 3){
		
		if( pos == (pow(2,height+1)) ){
			
			height++;
		}
		printf("Now height %d\n:",height);
	    //Check insert position is left or right
		int direction = (pow(2,height)*3/2); 
		if( pos < direction ){ //insert left tree node
			
			halfheight = height / 2;
			corpos = pos + pow(2,halfheight);
			printf("L POS: %d CORPOS: %d direc %d\n" ,pos,corpos,direction);
			//corresponding node in right tree is not exist
			if( deap[corpos] == -1){ 
			    if( deap[ corpos/2] < deap[pos]){
					temp = deap[ corpos/2 ];
					deap[corpos/2] = deap[pos];
					deap[pos] = temp;
					//heapify
					heapify(pos,1);
				}
			}else if(deap[corpos] != -1){ //exist
			    if( deap[ corpos] < deap[pos]){
					temp = deap[ corpos ];
					deap[corpos] = deap[pos];
					deap[pos] = temp;
					//heapify
					//********......
					//.......
				}
			
			}

		}else if( pos >= direction ){//insert right tree node
		
			halfheight = height / 2;
			corpos = pos - pow(2,halfheight);
			
			printf("R  POS: %d CORPOS: %d direc %d\n" ,pos,corpos,direction);
			if( deap[pos] < deap[corpos]){
					temp = deap[ corpos ];
					deap[corpos] = deap[pos];
					deap[pos] = temp;
				    //heapify right
					heapify(pos ,2);
			}

		}
		
			
	}
}
//heapify the left tree or right tree
int heapify(int pos , int direction ){

	int temp;
 	int parent_pos=0;
	parent_pos = pos/2;

	if(parent_pos == 1) return;

	if(direction == 1){

		if(deap[pos] < deap[parent_pos]){
			temp = deap[pos];
			deap[pos] = deap[parent_pos];
			deap[parent_pos] = temp;
			heapify(parent_pos,1);
		}
	}else if(direction == 2){
	
		if(deap[pos] > deap[parent_pos]){
			temp = deap[pos];
			deap[pos] = deap[parent_pos];
			deap[parent_pos] = temp;
			heapify(parent_pos,2);
		}
	
	}
}
