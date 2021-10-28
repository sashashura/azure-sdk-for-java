// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.core.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import reactor.util.function.Tuple2;
import reactor.util.function.Tuples;

/**
 * Memorize function execution result
 *
 * @author Warren Zhu
 */
public class Memoizer {

    public static <T, R> Function<T, R> memoize(Function<T, R> fn) {
        Map<T, R> map = new ConcurrentHashMap<>();
        return (t) -> map.computeIfAbsent(t, fn);
    }

    public static <T, R> Function<T, R> memoize(Map<T, R> map, Function<T, R> fn) {
        return (t) -> map.computeIfAbsent(t, fn);
    }

    public static <T, U, R> BiFunction<T, U, R> memoize(BiFunction<T, U, R> biFunction) {
        Map<Tuple2<T, U>, R> map = new ConcurrentHashMap<>();
        return (t, u) -> map.computeIfAbsent(Tuples.of(t, u), (k) -> biFunction.apply(k.getT1(), k.getT2()));
    }

    public static <T, U, R> BiFunction<T, U, R> memoize(Map<Tuple2<T, U>, R> map, BiFunction<T, U, R> biFunction) {
        return (t, u) -> map.computeIfAbsent(Tuples.of(t, u), (k) -> biFunction.apply(k.getT1(), k.getT2()));
    }
}