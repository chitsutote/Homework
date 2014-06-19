#include <iostream>
#include <fstream>
#include <string>
#define MAX_PREFIX_NUM 1000

using namespace std;


int main(){

	char prefixSet[MAX_PREFIX_NUM];
	
	fstream fin;
	fin.open("PrefixSet.txt",ios::in);

	if(!fin){
		cout << "Can't open file"<<endl;
	}

	while(fin.getline(prefixSet,sizeof(prefixSet),'\n')){
		cout<<prefixSet<<endl;
	}

	return 0;

}
