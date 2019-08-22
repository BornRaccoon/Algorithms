/*************************************************************************
*	Description:		Simple C++ Insertion Sort
*	Name:				maintest1.cpp
*	Author:				BornRaccoon
**************************************************************************/

#include "stdafx.h"
#include "CppUnitTest.h"
#include "../InsertionSortC++/main.h"
#include <iostream>

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace InsertionSortCTest
{		
	TEST_CLASS(UnitTest1)
	{
	public:
		
		TEST_METHOD(TestInversionSortPass)
		{
			bool error = false;
			int predefSeq[] = { 31, 11, 1, 6, 8, 200, 2, 99, 13, 20};
			int expSeq[]	= { 1, 2, 6, 8, 11, 13, 20, 31, 99, 200};
			runInsertionSort(predefSeq);

			for (int index = 0; index < NUMBER_OF_ELEMENTS; index++)
				Assert::AreEqual(predefSeq[index], expSeq[index]);
						
		}

		TEST_METHOD(TestInversionSortFail)
		{
			bool error = false;
			int predefSeq[] = { 31, 11, 1, 6, 8, 200, 2, 99, 13, 20 };
			int expSeq[] = { 31, 11, 1, 6, 8, 200, 2, 99, 13, 20 };
			runInsertionSort(predefSeq);

			for (int index = 0; index < NUMBER_OF_ELEMENTS; index++)
				Assert::AreNotEqual(predefSeq[index], expSeq[index]);
				
		}
	};
}