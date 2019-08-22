/*************************************************************************
*	Description:		Simple C++ Insertion Sort
*	Name:				main.cpp
*	Author:				BornRaccoon
**************************************************************************/
#include "pch.h"
#include <iostream>
#include "main.h"


void runInsertionSort(int * sequenceToSort)
{
	int index = 1;
	for (; index < NUMBER_OF_ELEMENTS; index++)
	{
		int key = sequenceToSort[index];
		signed int comparison = index - 1;
		while (comparison >= 0 && sequenceToSort[comparison] > key)
		{
			sequenceToSort[comparison + 1] = sequenceToSort[comparison];
			comparison--;
		}
		sequenceToSort[comparison + 1] = key;
	}
}

void printValues(int* sequenceToSort)
{
	int index = 0;
	for (; index < NUMBER_OF_ELEMENTS; index++)
	{
		std::cout << sequenceToSort[index];
		std::cout << "\t";
	}
	std::cout << "\n";
}

void generateValuesForSort(int* sequenceToSort)
{
	int index = 0;
	for (; index < NUMBER_OF_ELEMENTS; index++)
	{
		sequenceToSort[index] = rand() % RAND_MAX_ + RAND_MIN_;
	}
}

int main()
{
	int * sequenceToSort;
	sequenceToSort = new int[NUMBER_OF_ELEMENTS];
	memset(sequenceToSort, 0, NUMBER_OF_ELEMENTS);
	generateValuesForSort(sequenceToSort);
	printValues(sequenceToSort);
	runInsertionSort(sequenceToSort);
	printValues(sequenceToSort);
	free(sequenceToSort);
	return 0;
}




