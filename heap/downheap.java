private void downheap(int index) {
    int min = index;
    int left = left(index);
    int right = right(index);

    if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
      min = left;
    }

    if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
      min = right;
    }

    if(min != index) {
      swap(min, index);
      downheap(min);
    }
  }
