#include <iostream>
#include <fstream>
#include <string>
#include <cstring>

using namespace std;

#define MAX_PREFIX_NUM 1000
#define MAX_PREFIX_LENGTH 32


char prefixSet[MAX_PREFIX_NUM][MAX_PREFIX_LENGTH];

using namespace std;

void BuildPriorityTrie(int);

int main(){

	int count = 0;
	
	fstream fin;
	fin.open("PrefixSet.txt",ios::in);

	if(!fin){
		cout << "Can't open file"<<endl;
	}

	while(fin.getline(prefixSet[count],sizeof(prefixSet[count]),'\n')){
		cout<<prefixSet[count]<<endl;
		count++;
	}

	fin.close();
	return 0;

}

void BuildPriorityTrie(int count){
/*
	for(int i = 0; i < count;i++){
		cout << *prefixSet[i] << " " << strlen(*prefixSet[i]) << endl;
	}
*/
}
