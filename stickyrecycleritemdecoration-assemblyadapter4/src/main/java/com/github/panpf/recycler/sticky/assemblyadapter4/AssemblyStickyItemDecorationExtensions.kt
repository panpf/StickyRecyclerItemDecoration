/*
 * Copyright (C) 2021 panpf <panpfpanpf@outlook.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.panpf.recycler.sticky.assemblyadapter4

import androidx.recyclerview.widget.RecyclerView
import com.github.panpf.assemblyadapter.ItemFactory
import kotlin.reflect.KClass

/**
 * Add a [AssemblyStickyItemDecoration] to [RecyclerView] by specifying the position
 */
fun RecyclerView.addAssemblyStickyItemDecorationWithPosition(
    positionList: List<Int>,
    config: (AssemblyStickyItemDecoration.Builder.() -> Unit)? = null
) {
    addItemDecoration(
        AssemblyStickyItemDecoration.Builder().apply {
            position(positionList)
            config?.invoke(this)
        }.build()
    )
}

/**
 * Add a [AssemblyStickyItemDecoration] to [RecyclerView] by specifying the position
 */
fun RecyclerView.addAssemblyStickyItemDecorationWithPosition(
    vararg positionArray: Int,
    config: (AssemblyStickyItemDecoration.Builder.() -> Unit)? = null
) {
    addItemDecoration(
        AssemblyStickyItemDecoration.Builder().apply {
            position(positionArray.toList())
            config?.invoke(this)
        }.build()
    )
}

/**
 * Add a [AssemblyStickyItemDecoration] to [RecyclerView] by specifying the type
 */
fun RecyclerView.addAssemblyStickyItemDecorationWithItemType(
    itemTypeList: List<Int>,
    config: (AssemblyStickyItemDecoration.Builder.() -> Unit)? = null
) {
    addItemDecoration(
        AssemblyStickyItemDecoration.Builder().apply {
            itemType(itemTypeList)
            config?.invoke(this)
        }.build()
    )
}

/**
 * Add a [AssemblyStickyItemDecoration] to [RecyclerView] by specifying the type
 */
fun RecyclerView.addAssemblyStickyItemDecorationWithItemType(
    vararg itemTypeArray: Int,
    config: (AssemblyStickyItemDecoration.Builder.() -> Unit)? = null
) {
    addItemDecoration(
        AssemblyStickyItemDecoration.Builder().apply {
            itemType(itemTypeArray.toList())
            config?.invoke(this)
        }.build()
    )
}

/**
 * Add a [AssemblyStickyItemDecoration] to [RecyclerView] by specifying the [ItemFactory]
 */
fun RecyclerView.addAssemblyStickyItemDecorationWithItemFactory(
    itemFactoryClassList: List<KClass<out ItemFactory<out Any>>>,
    config: (AssemblyStickyItemDecoration.Builder.() -> Unit)? = null
) {
    addItemDecoration(
        AssemblyStickyItemDecoration.Builder().apply {
            itemFactory(itemFactoryClassList)
            config?.invoke(this)
        }.build()
    )
}

/**
 * Add a [AssemblyStickyItemDecoration] to [RecyclerView] by specifying the [ItemFactory]
 */
fun RecyclerView.addAssemblyStickyItemDecorationWithItemFactory(
    vararg itemFactoryClassArray: KClass<out ItemFactory<out Any>>,
    config: (AssemblyStickyItemDecoration.Builder.() -> Unit)? = null
) {
    addItemDecoration(
        AssemblyStickyItemDecoration.Builder().apply {
            itemFactory(itemFactoryClassArray.toList())
            config?.invoke(this)
        }.build()
    )
}

/**
 * Add a [AssemblyStickyItemDecoration] to [RecyclerView]
 */
fun RecyclerView.addAssemblyStickyItemDecoration(
    config: AssemblyStickyItemDecoration.Builder.() -> Unit
) {
    addItemDecoration(
        AssemblyStickyItemDecoration.Builder().apply {
            config(this)
        }.build()
    )
}