package com.generation.fragment.fragment

import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.DatePicker
import androidx.fragment.app.DialogFragment
import java.time.LocalDate
import java.time.ZoneId
import java.util.*

class DatePickerFragment(
    val timerPickerListener: TimerPickerListener
    ) : DialogFragment(), DatePickerDialog.OnDateSetListener {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        return DatePickerDialog(requireContext(), this, year, month, day)
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        val calander = Calendar.getInstance()
        calander.set(Calendar.YEAR, year)
        calander.set(Calendar.MONTH, month)
        calander.set(Calendar.DAY_OF_MONTH, dayOfMonth)

        timerPickerListener.onDateSelected(calander.time.toInstant().atZone(
            ZoneId.systemDefault()).toLocalDate())
    }

}


interface  TimerPickerListener{
    fun onDateSelected(date: LocalDate)
}