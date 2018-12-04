# coding:utf-8


def bubble_sort(data, reverse):
    """

    :param data: list
    :param reverse: boolean -> true: small -> big, vice versa.
    :return: sorted list
    """
    if len(data) == 1:
        return
    for i in range(len(data) - 1):
        for j in range(len(data) - i - 1):
            if reverse:
                if data[j] >= data[j + 1]:
                    tmp = data[j]
                    data[j] = data[j + 1]
                    data[j + 1] = tmp
            else:
                if data[j] <= data[j + 1]:
                    tmp = data[j]
                    data[j + 1] = data[j]
                    data[j] = tmp


if __name__ == '__main__':
    a = [19, 25, 2, 1, 4, 23, 5, 7, 67, 3, 3, 1, 8, 74]
    bubble_sort(a, True)
    print(a)
