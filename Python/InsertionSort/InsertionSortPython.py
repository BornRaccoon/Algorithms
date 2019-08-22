# /*************************************************************************
# *	Name:       insertionSortPython.py
# *	Author:     BornRaccoon
# **************************************************************************/


def main():
    sequence = [1, 34, 2, 3, 4, 140, 12, 55, 13, 10]
    print(sequence)
    sorted_sequence = run(sequence)
    print(sorted_sequence)


def run(sequence):
    for index in range(1, 10):
        key = sequence[index]
        comparison = index - 1
        while comparison >= 0 and sequence[comparison] > key:
            sequence[comparison + 1] = sequence[comparison]
            comparison = comparison - 1
        sequence[comparison + 1] = key
    return sequence


if __name__ == '__main__':
    main()
