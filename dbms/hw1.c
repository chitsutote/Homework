#include <stdio.h>
#include <stdlib.h>

int deap[1000];
int height;

void insert(int);
void heapify();

int main(){

	int c;
	int deap[1000];
	FILE *file;
	file = fopen("deap.in","r");

	while( fscanf(file,"%d",&c)!= -1 ){
		printf("%d\n",c);
	
	}
	fclose(file);
	return 0;
}

void insert(int input){

}

void heapify(){


}
